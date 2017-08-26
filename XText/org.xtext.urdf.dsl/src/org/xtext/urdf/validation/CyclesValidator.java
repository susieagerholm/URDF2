package org.xtext.urdf.validation;

import java.util.HashMap;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.Robot;
import org.xtext.urdf.myURDF.Topology;



public class CyclesValidator {
	
	public RootCheck oneRoot(EList<Topology> topoList) {
		return getRootTopologies(topoList, true);
	}
	
	
	private String getCycleLink(HashMap<String, Integer> counter) {
		String cycleLink = null;
		for (String key : counter.keySet()) {
			 int value = counter.get(key);
			 if(value>1) {
				cycleLink = key;
				break;
			 }
		}
		return cycleLink;
	}
	
	
	public ParentCheck parentCheck(EList<Topology> topoList) {
		
		HashMap<String, String> map = new HashMap<>();
		ParentCheck checker = new ParentCheck();
		checker.setChecker(map);
		
		for (Topology topo : topoList) {
			checker = countParents(topo, checker);
			if(checker.isValidationError()) {
				break;
			}
		}
		return checker;
	}
	
	private ParentCheck countParents(Topology topo, ParentCheck check) {
		if(topo.getParent() != null && topo.getChild() != null) { 
			  //If the parent name does NOT equal the parent name we are about to put in - there is an error
			  String parentName = check.getChecker().get(topo.getChild().getParent().getName());
			  if(parentName != null && !parentName.equalsIgnoreCase(topo.getParent().getName())) {
				  check.setErrorLink(topo.getChild().getParent());
				  check.setValidationError(true);
			  } else {
				  check.getChecker().put(topo.getChild().getParent().getName(), topo.getParent().getName());
				  countParents(topo.getChild(), check);
			  }
		}
		 
		return check;
	}

	@SuppressWarnings("unchecked")
	private <T> T getRootTopologies(EList<Topology> topoList, boolean returnPotentialCandidates) {
		//Only the first link in a topology can be a potential root
		//Therefore take the first link in a chain and check whether this link exists in one of the other chains
		//If it does exist it cannot be root - unless if it's the first link in the chain 
		HashMap<Topology,Boolean> map = new HashMap<Topology, Boolean>();
		
		for (Topology topoOuter : topoList) {
			Link potentialRoot = topoOuter.getParent();
			map.put(topoOuter, true);
			for (Topology topoInner : topoList) {
				if(topoOuter.equals(topoInner)) {
					//We do not need to check the chain if it's the same topology 
					continue;
				} else {
					//If two topologies start with the same link - they can both be a potential root topology
					//Therefore we start by checking the rest of the chain
					if(topoInner.getChild() != null) {
					  boolean found = isLinkInChain(topoInner.getChild(),potentialRoot);
					  //We found the link in one of the other chains and therefore it cannot be root
					  if(found) {
						  map.put(topoOuter, false);
						  break;
					  } 
					}
				}
			}
		}
		
		if(returnPotentialCandidates) {
			return (T)getRootCheck(map);
		}

		//if getRootTopos return null there are multiple roots
		return (T)getRootTopos(map);

	}

	private RootCheck getRootCheck(HashMap<Topology,Boolean> map) {
		RootCheck check = new RootCheck();
		check.setValidationError(false);
		EList<Topology> temp = new BasicEList<Topology>();

		String tempLink = null;
		for (Topology topo : map.keySet()) {
			if(map.get(topo) == false) {
				continue;
			}
			temp.add(topo);
			check.addPrettyPrintLine(printTopo(topo, null));
			if(tempLink==null) {
				tempLink = topo.getParent().getName();
			} else if(!tempLink.equals(topo.getParent().getName())) {
					check.setValidationError(true);
			}
		}
		check.setPotentialRoots(temp);
		return check;
	}

	private String printTopo(Topology topo, String printLine) {
		if(topo == null || topo.getParent() == null) {
			return "Topology incomplete - parent is null";
		}
		
		if(printLine == null) {
			printLine="";
		}
		printLine = (printLine=="" ? topo.getParent().getName() : printLine + " -> " + topo.getParent().getName());
		
		if(topo.getChild() != null) {
			printLine = printTopo(topo.getChild(), printLine);
		} 
		return printLine;
	}

	private EList<Topology> getRootTopos(HashMap<Topology,Boolean> map) {
		String tempLink = null;
		EList<Topology> temp = new BasicEList<Topology>();
		for (Topology topo : map.keySet()) {
			if(map.get(topo) == false) {
				//The false ones are not root topologies
				continue;
			}
			if(tempLink==null) {
				tempLink = topo.getParent().getName();
				temp.add(topo);
			} else {
				if(tempLink.equals(topo.getParent().getName())) {
					temp.add(topo);
					continue;
				} else {
					temp = null;
					break;
				}
			}
		}
		if(temp == null || temp.isEmpty()) {
			temp = null;
		}
		return temp;
	}
	
	
	private HashMap<String, Integer> countLinksInChain(GenericTreeNode<String> leaf, HashMap<String, Integer> counter) {
		if(counter == null) {
			counter = new HashMap<String,Integer>();
		}
		if(leaf != null) {
			counter.put(leaf.getData(), counter.get(leaf.getData()) == null ? 1 : counter.get(leaf.getData()) + 1 );
		} 
		if(leaf.getParent() !=null) {
			counter = countLinksInChain(leaf.getParent(), counter);
		}
		return counter;
	}


	private boolean isLinkInChain(Topology topo, Link potentialRootLink) {
		    boolean temp = false;
			if(topo.getParent().getName().equals(potentialRootLink.getName())) {
				return true;
			} else if (topo.getChild() != null) {
				temp = isLinkInChain(topo.getChild(), potentialRootLink);
			}
			return temp;
	}

	public String cycles(Robot robot,boolean returnPotentialRoots) {
		EList<Topology> topoList = robot.getTopologies();
	    GenericTree<String> tree = new GenericTree<String>();
	    
	    //Start to get the root topologies
	    EList<Topology> rootList = getRootTopologies(topoList,returnPotentialRoots);
	    if(rootList == null) {
	    	return null;
	    }
	    
		for (Topology topo : rootList) {
			GenericTreeNode<String> node = buildNodeChainFromTopology(topo, null);
			if(tree.getRoot() == null) {
				tree.setRoot(node.getTopNode());;
			} else if(tree.getRoot().equals(node.getTopNode())) {
				if(!node.getTopNode().getChildren().isEmpty()) {
					tree.getRoot().addChild(node.getTopNode().getChildAt(0));
				}
			} else {
				System.out.println("It should not be possible to end here");
			}
			System.out.println(tree.toStringWithDepth());
		}
		
		topoList.removeAll(rootList);

		//build rest of the tree
		for (Topology topo : topoList) {
			GenericTreeNode<String> parentNode = tree.find(topo.getParent().getName()).getParent();
			GenericTreeNode<String> childNode = buildNodeChainFromTopology(topo, null);
			parentNode.addChild(childNode);
			System.out.println(tree.toStringWithDepth());
		}
		
		return checkForCycles(tree);
	}

	
	private String checkForCycles(GenericTree<String> tree) {
		String cycleLink = null;
		Set<GenericTreeNode<String>> temp = tree.getRoot().getAllLeafNodes();
		for(GenericTreeNode<String> leaf : temp) {
			HashMap<String,Integer> map = countLinksInChain(leaf, null);
			cycleLink = getCycleLink(map);
			if(cycleLink != null) {
				break;
			}
		}
		return cycleLink;
	}

	
	private GenericTreeNode<String> buildNodeChainFromTopology(Topology topo, GenericTreeNode<String> node) {
		if(topo.getParent() != null) {
			GenericTreeNode<String> temp = new GenericTreeNode<>(topo.getParent().getName());
			if(node != null) {
				node.addChild(temp);
			} else {
				node = temp;
			}
			if(topo.getChild() != null) {
				node = buildNodeChainFromTopology(topo.getChild(),temp);
			}
		}
		return node;
	}
	
}
