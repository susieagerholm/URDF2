package org.xtext.urdf.validation;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.Robot;
import org.xtext.urdf.myURDF.Topology;



public class CyclesValidator
{
	public boolean oneRoot(Robot robot) {
		
		if(robot.getLinks().size()>1 && robot.getJoint().size()==0) {
			return false;
		} else {
			EList<Topology> newTopoList = merge(robot.getTopologies());
			if(newTopoList.size()==1) {
				return true;
			} else if(newTopoList.size()>1) {
				Iterator<Topology> iter = newTopoList.iterator();
				String firstRoot = null;
				while (iter.hasNext()) {
					Topology aTopo = iter.next();
					if(firstRoot == null) {
						if(aTopo.getParent()==null) {
							System.out.println("Topology invalid");
							return true;
						}
						firstRoot = aTopo.getParent().getName();
					} else {
						if(aTopo.getParent().getName().equals(firstRoot)) {
							continue;
						} else {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
	
	public String[] cycles(Robot robot) {
		if(robot.getTopologies() == null || robot.getTopologies().size()==0) {
			return new String[] {"FALSE"};
		} else {
			// We have an issue when processing the first (during startup) cycles validation. The Child reference in the topology objects are null ! As if validation is called to early...
			// This might trigger a wrong validation state after startup. Making for example a space in the UI - triggering another validation event - gives correct validation. How to solve? 
			EList<Topology> topoList = merge(robot.getTopologies());
			for (Topology aTopo : topoList) {
				System.out.println("After merge: ");
				printTopo(aTopo, null);
				HashMap<String, Integer> temp = countLinksInChain(aTopo,new HashMap<String, Integer>());
				String[] cycle = isCycle(temp);
				if(cycle[0]=="TRUE")
					return cycle;
			}
		}
		return new String[] {"FALSE"};
	}
	
	private String[] isCycle(HashMap<String, Integer> counter) {
		for (String key : counter.keySet()) {
			 int value = counter.get(key);
			 if(value>1) {
				return new String[] {"TRUE",key};
			 }
		}
		return new String[] {"FALSE"};
	}
	
	
	private HashMap<String, Integer> countLinksInChain(Topology topo, HashMap<String, Integer> counter) {
		if(topo.getParent() != null) {
			counter.put(topo.getParent().getName(), counter.get(topo.getParent().getName()) == null ? 1 : counter.get(topo.getParent().getName()) + 1 );
		} 
		if(topo.getChild() !=null) {
			counter = countLinksInChain(topo.getChild(), counter);
		}
		return counter;
	}
	
	
	private EList<Topology> merge(EList<Topology> topoList) {
		if(topoList.size() == 1) {
			return topoList;
		}
		
		EList<Topology> newTopoList = new BasicEList<Topology>();
		boolean merge = false;

		outerloop:
		for (int i = 0; i<topoList.size();i++) { //Do not use 'enhanced' loop syntax style when handling nested loops
			Topology aTopo = topoList.get(i);
//			System.out.println("Outer: "); 
//			printTopo(aTopo,null);
			for (Topology anotherTopo : topoList) {
				if(aTopo.equals(anotherTopo)) {
					continue;
				}
//				System.out.println("Inner: " );
//				printTopo(anotherTopo,null);
				Topology temp = manageTopologies(aTopo, anotherTopo);
				if(temp != null) {
					merge = true;
					//merge Succesful
					for (Topology topoTemp : topoList) {
						if(topoTemp.equals(anotherTopo) || topoTemp.equals(aTopo)) {
							continue;
						} else {
							newTopoList.add(topoTemp);
						}
					}
					newTopoList.add(temp);
					break outerloop;
				}
			}
		}
		
		if(merge) {
			newTopoList = merge(newTopoList);
			merge = false;
		}
		if(newTopoList.size() == 0) {
			//no merge
			newTopoList = topoList;
		}
		
		return newTopoList;
	}
	
	public Topology manageTopologies(Topology topo1,Topology topo2) {
		Topology newTopo = null;

		//first find possible connection points
		String topo1First = topo1.getParent().getName();
		String topo1Last = getLastChild(topo1).getName();
		String topo2First = topo2.getParent().getName();
		String topo2Last = getLastChild(topo2).getName();
		
		//Only combinations with a start and a end is possible - that is, two topologies that
		//starts with L1 cannot be merged
		if(topo1Last.equals(topo2First)) {
			newTopo = topo1;
			getMergeTopology(newTopo).setChild(topo2);
		} else if(topo2Last.equals(topo1First)) {
			newTopo = topo2;
			getMergeTopology(newTopo).setChild(topo1);
		}
//		System.out.println("Merged: ");
//		printTopo(newTopo,null);
		return newTopo;
		
		//Example of possible connections:
		// L1 -> L2
		// L2 -> L3
		// L1 -> L2 -> L3
		
		// L1 -> L2
		// L4 -> L1
		// L4 -> L1 -> L2
		
	}

	
	private String printTopo(Topology topo, String printLine) {
		if(topo == null || topo.getParent() == null) {
			return "Topology incomplete - parent is null";
		}
		
		boolean top = false;
		if(printLine == null) {
			printLine="";
			top=true;
		}
		printLine = (printLine=="" ? topo.getParent().getName() : printLine + " -> " + topo.getParent().getName());
		
		if(topo.getChild() != null) {
			printLine = printTopo(topo.getChild(), printLine);
		} 
		
		if(top) {
			System.out.println(printLine);
		}
		return printLine;
	}
	
	private Link getLastChild(Topology aTopo) {
		if(aTopo.getChild() != null) {
			return getLastChild(aTopo.getChild());
		} else {
			return aTopo.getParent();
		}
	}
	
	private Topology getMergeTopology(Topology aTopo) {
		//Get the topology object to which we connect another Topology - not the last - but the one before 
		if(aTopo.getChild() != null && aTopo.getChild().getChild()!=null) {
			return getMergeTopology(aTopo.getChild());
		} else {
			return aTopo;
		}
	}
	
}
