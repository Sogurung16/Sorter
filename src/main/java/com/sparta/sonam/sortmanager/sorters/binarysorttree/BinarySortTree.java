package com.sparta.sonam.sortmanager.sorters.binarysorttree;

import com.sparta.sonam.sortmanager.sorters.Sorter;

public class BinarySortTree implements Sorter {
    private final String name;

    public BinarySortTree(){
        this.name = "BinaryTreeSort";
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        insertNodesIntoTree(arrayToSort);
        return getBST_SortedArray(arrayToSort);
    }

    private void insertNodesIntoTree(int[] arrayToSort){
        final Node rootNode = new Node(arrayToSort[0]);
        for(int i = 0; i < arrayToSort.length; i++){
            addNodeIntoTree(rootNode, arrayToSort[i]);
        }
    }

    private void addNodeIntoTree(Node node, int value){
        if(value==node.getValue()) return;

        if(value<node.getValue()){
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(value));
            } else {
                addNodeIntoTree(node.getLeftChild(), value);
            }
        }else if (value>node.getValue()){
            if (node.isRightChildEmpty()){
                node.setRightChild(new Node(value));
            } else{
                addNodeIntoTree(node.getRightChild(), value);
            }
        }
    }

    /* TODO(2): Perform in-order traversal on the tree to get the elements in sorted order.
    LeftSub-tree -> parent -> RightSub-tree*/
    private int[] getBST_SortedArray(int[] arrayToSort){
        return new int[0];
    }


    @Override
    public String getName() {
        return name;
    }
}
