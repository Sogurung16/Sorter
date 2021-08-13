package com.sparta.sonam.sortmanager.sorters.binarysorttree;

public class Node {
    private int value;
    //private int subTree;
    private Node leftChild, rightChild;
    //private boolean visited;

    Node(int value){
        this.value = value;
        /*this.visited = false;
        this.subTree = 0;*/
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isLeftChildEmpty(){
        return leftChild == null?true:false;
    }
    public boolean isRightChildEmpty(){
        return rightChild == null?true:false;
    }

 /*   public boolean hasVisited() {
        return visited;
    }
    public void setVisited(boolean visited) {
        this.visited = visited;
    }*/

    /*public int getSubTree() {
        return subTree;
    }
    public void setSubTree(int subTree) {
        this.subTree = subTree;
    }*/
}
