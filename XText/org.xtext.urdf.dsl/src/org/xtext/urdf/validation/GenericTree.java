package org.xtext.urdf.validation;


import java.util.*;

public class GenericTree<T> {

   public enum GenericTreeTraversalOrderEnum {PRE_ORDER,POST_ORDER}

   private GenericTreeNode<T> root;

   public GenericTree() {
       super();
   }

   public GenericTreeNode<T> getRoot() {
       return this.root;
   }

   public void setRoot(GenericTreeNode<T> root) {
       this.root = root;
   }

   public int getNumberOfNodes() {
       int numberOfNodes = 0;

       if(root != null) {
           numberOfNodes = auxiliaryGetNumberOfNodes(root) + 1; //1 = root!
       }

       return numberOfNodes;
   }

   private int auxiliaryGetNumberOfNodes(GenericTreeNode<T> node) {
       int numberOfNodes = node.getNumberOfChildren();

       for(GenericTreeNode<T> child : node.getChildren()) {
           numberOfNodes += auxiliaryGetNumberOfNodes(child);
       }

       return numberOfNodes;
   }

   public boolean exists(T dataToFind) {
       return (find(dataToFind) != null);
   }

   public GenericTreeNode<T> find(T dataToFind) {
       GenericTreeNode<T> returnNode = null;

       if(root != null) {
           returnNode = auxiliaryFind(root, dataToFind);
       }

       return returnNode;
   }

   private GenericTreeNode<T> auxiliaryFind(GenericTreeNode<T> currentNode, T dataToFind) {
       GenericTreeNode<T> returnNode = null;
       int i = 0;

       if (currentNode.getData().equals(dataToFind)) {
           returnNode = currentNode;
       }

       else if(currentNode.hasChildren()) {
           i = 0;
           while(returnNode == null && i < currentNode.getNumberOfChildren()) {
               returnNode = auxiliaryFind(currentNode.getChildAt(i), dataToFind);
               i++;
           }
       }

       return returnNode;
   }

   public boolean isEmpty() {
       return (root == null);
   }

   public List<GenericTreeNode<T>> build(GenericTreeTraversalOrderEnum traversalOrder) {
       List<GenericTreeNode<T>> returnList = null;

       if(root != null) {
           returnList = build(root, traversalOrder);
       }

       return returnList;
   }

   public List<GenericTreeNode<T>> build(GenericTreeNode<T> node, GenericTreeTraversalOrderEnum traversalOrder) {
       List<GenericTreeNode<T>> traversalResult = new ArrayList<GenericTreeNode<T>>();

       if(traversalOrder == GenericTreeTraversalOrderEnum.PRE_ORDER) {
           buildPreOrder(node, traversalResult);
       }

       else if(traversalOrder == GenericTreeTraversalOrderEnum.POST_ORDER) {
           buildPostOrder(node, traversalResult);
       }

       return traversalResult;
   }

   private void buildPreOrder(GenericTreeNode<T> node, List<GenericTreeNode<T>> traversalResult) {
	   //When building the tree pre order - we start by adding the node to the result and then  
	   //step down the tree. This means we will add nodes starting from the top

	   traversalResult.add(node);

       for(GenericTreeNode<T> child : node.getChildren()) {
           buildPreOrder(child, traversalResult);
       }
   }

   private void buildPostOrder(GenericTreeNode<T> node, List<GenericTreeNode<T>> traversalResult) {
	   //When building the tree post order - run through all the nodes until leaf and then add the node to 
	   //traversalresult. This means we will start from the bottom
	   
       for(GenericTreeNode<T> child : node.getChildren()) {
           buildPostOrder(child, traversalResult);
       }

       traversalResult.add(node);
   }

   public Map<GenericTreeNode<T>, Integer> buildWithDepth(GenericTreeTraversalOrderEnum traversalOrder) {
       Map<GenericTreeNode<T>, Integer> returnMap = null;

       if(root != null) {
           returnMap = buildWithDepth(root, traversalOrder);
       }

       return returnMap;
   }

   public Map<GenericTreeNode<T>, Integer> buildWithDepth(GenericTreeNode<T> node, GenericTreeTraversalOrderEnum traversalOrder) {
       Map<GenericTreeNode<T>, Integer> traversalResult = new LinkedHashMap<GenericTreeNode<T>, Integer>();

       if(traversalOrder == GenericTreeTraversalOrderEnum.PRE_ORDER) {
           buildPreOrderWithDepth(node, traversalResult, 0);
       }

       else if(traversalOrder == GenericTreeTraversalOrderEnum.POST_ORDER) {
           buildPostOrderWithDepth(node, traversalResult, 0);
       }

       return traversalResult;
   }

   private void buildPreOrderWithDepth(GenericTreeNode<T> node, Map<GenericTreeNode<T>, Integer> traversalResult, int depth) {
       traversalResult.put(node, depth);

       for(GenericTreeNode<T> child : node.getChildren()) {
           buildPreOrderWithDepth(child, traversalResult, depth + 1);
       }
   }

   private void buildPostOrderWithDepth(GenericTreeNode<T> node, Map<GenericTreeNode<T>, Integer> traversalResult, int depth) {
       for(GenericTreeNode<T> child : node.getChildren()) {
           buildPostOrderWithDepth(child, traversalResult, depth + 1);
       }
       traversalResult.put(node, depth);
   }

   public String toString() {
       String stringRepresentation = "";
       if(root != null) {
           stringRepresentation = build(GenericTreeTraversalOrderEnum.PRE_ORDER).toString();

       }
       return stringRepresentation;
   }

   public List<GenericTreeNode<T>> getAllNodes() {
	   List<GenericTreeNode<T>> temp = null;
       if(root != null) {
           temp = build(GenericTreeTraversalOrderEnum.PRE_ORDER);

       }
       return temp;
   }
   
   public boolean isLeafNode(GenericTreeNode<T> node) {
	   Set<GenericTreeNode<T>> aSet = getRoot().getAllLeafNodes();
	   for (GenericTreeNode<T> aNode : aSet) {
		   if(node.equals(aNode)) {
			   return true;
		   }
	   }
	   return false;
   }
  
   public String toStringWithDepth() {
       String stringRepresentation = "";

       if(root != null) {
           stringRepresentation = buildWithDepth(GenericTreeTraversalOrderEnum.PRE_ORDER).toString();
       }
       return stringRepresentation;
   }

}
