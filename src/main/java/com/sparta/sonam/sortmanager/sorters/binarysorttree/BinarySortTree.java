package com.sparta.sonam.sortmanager.sorters.bst;

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

    /* TODO(1): Insert data items from array into BST.
    Root node
    go left (child < parentNode)
    go right (child >= parentNode)*/
    private void insertNodesIntoTree(int[] arrayToSort){
        final Node rootNode = new Node(arrayToSort[0]);
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
