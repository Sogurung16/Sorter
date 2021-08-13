package com.sparta.sonam.sortmanager.sorters.binarysorttree;

public class BinarySearchTree {
    private final Node rootNode;
    private int positionInArray;
    private int[] sortedArray;

    public BinarySearchTree(final int value){
        rootNode = new Node(value);
    }

    public int[] getBST_SortedArray(int[] arrayToSort){
        sortedArray = new int[arrayToSort.length];

        insertNodesIntoTree(arrayToSort);

        traverseTree(rootNode);

        return sortedArray;
    }

    private void insertNodesIntoTree(int[] arrayToSort){
        //rootNode.setSubTree(0);
        for(int i = 0; i < arrayToSort.length; i++){
            addNodeIntoTree(rootNode, arrayToSort[i]);
        }
    }

    private void addNodeIntoTree(Node node, int value){
        //int numSubTree = node.getSubTree();
        if(value==node.getValue()) return;
        //node.setSubTree(numSubTree++);
        if(value<node.getValue()){
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(value));
            } else {
                addNodeIntoTree(node.getLeftChild(), value);
            }
        }else if (value>=node.getValue()){
            if (node.isRightChildEmpty()){
                node.setRightChild(new Node(value));
            } else{
                addNodeIntoTree(node.getRightChild(), value);
            }
        }
    }

    private void traverseTree(Node rootNode){
        Node node = rootNode.getLeftChild();
        if(node!=null) {
            traverseLeft(node);
        }
        addCurrentNode(rootNode);
        node = rootNode.getRightChild();
        if(node!=null) {
            traverseRight(node);
        }
    }

    private void traverseLeft(Node node){
        if(node!=null){
            traverseTree(node);
        }
    }

    private void traverseRight(Node node){
        if(node!=null){
            traverseTree(node);
        }
    }

    private void addCurrentNode(Node node){
        sortedArray[positionInArray] = node.getValue();
        positionInArray++;
    }
}
