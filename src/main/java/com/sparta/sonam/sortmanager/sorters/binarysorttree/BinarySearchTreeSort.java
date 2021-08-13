package com.sparta.sonam.sortmanager.sorters.binarysorttree;

import com.sparta.sonam.sortmanager.sorters.Sorter;

public class BinarySearchTreeSort implements Sorter {
    private final String name;

    public BinarySearchTreeSort(){
        this.name = "BinaryTreeSort";
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        final int rootNode = arrayToSort[0];
        BinarySearchTree bst = new BinarySearchTree(rootNode);
        return bst.getBST_SortedArray(arrayToSort);
    }

    @Override
    public String getName() {
        return name;
    }
}
