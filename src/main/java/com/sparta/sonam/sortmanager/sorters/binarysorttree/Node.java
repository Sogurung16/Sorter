package com.sparta.sonam.sortmanager.sorters.binarysorttree;

public class Node {
    private int value, subTree;
    private Node leftChild, rightChild;

    Node(int value){
        this.value = value;
        this. subTree = 0;
    }

    public int getValue() {
        return value;
    }

    public int getSubTree() {
        return subTree;
    }
    public void setSubTree(int subTree) {
        this.subTree = subTree;
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
}
