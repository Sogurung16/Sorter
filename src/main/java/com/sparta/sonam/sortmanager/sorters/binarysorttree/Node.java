package com.sparta.sonam.sortmanager.sorters.binarysorttree;

public class Node {
    private int value, key;
    private Node leftChild, rightChild;

    Node(int value){
        this.value = value;
        this.setKey(0);
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

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public boolean isLeftChildEmpty(){
        return leftChild == null?true:false;
    }
    public boolean isRightChildEmpty(){
        return rightChild == null?true:false;
    }
}
