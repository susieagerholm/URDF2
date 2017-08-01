package org.xtext.urdf.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.MyURDFFactory;
import org.xtext.urdf.myURDF.Robot;
import org.xtext.urdf.myURDF.Topology;

public class CyclesValidator
{
	public boolean oneRoot(Robot robot) {
		
		if(robot.getLinks().size()>1 && robot.getJoint().size()==0) {
			return false;
		} else {
			ArrayList<Topology> newTopoList  = new ArrayList<Topology>();
			HashMap<Topology, Boolean> mergeStatus = new HashMap<>();
			EList<Topology> topos  = robot.getTopologies();
			for (int i = 0; i < topos.size(); i++) {

				Topology aTopo = topos.get(i);
				if(mergeStatus.containsKey(aTopo) && mergeStatus.get(aTopo)==true) {
					//The topology has been merged with another
					continue;
				}
				System.out.println("Outer: "); 
				printTopo(aTopo,null);
				for (int j = 0; j < topos.size(); j++) {
					Topology anotherTopo = topos.get(j);
					if(aTopo.equals(anotherTopo)) {
						continue;
					}
					System.out.println("Inner: " );
					printTopo(anotherTopo,null);
					newTopoList = manageTopologies(aTopo, anotherTopo,newTopoList,mergeStatus);
					
				}
			}
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
	


	public ArrayList<Topology> manageTopologies(Topology topo1,Topology topo2,ArrayList<Topology> newList,HashMap<Topology, Boolean> mergeStatus) {
//		Topology newTopo = MyURDFFactory.eINSTANCE.createTopology();
//      We use existing object - does merge affect UI?
		
		Topology newTopo = null;
		boolean found = false;

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
			found = true;
		} else if(topo2Last.equals(topo1First)) {
			newTopo = topo2;
			getMergeTopology(newTopo).setChild(topo1);
			found = true;
		} else {
			//Topologies cannot be merged, so we add them to the list separately
			newList.add(topo1);
			newList.add(topo2);
			mergeStatus.put(topo1, false);
			mergeStatus.put(topo2, false);
		}
		if(found) {
			mergeStatus.put(topo1, true);
			mergeStatus.put(topo2, true);
			newList.add(newTopo);
			System.out.println("Merged: ");
			printTopo(newTopo,null);
		}
		return newList;
		
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
