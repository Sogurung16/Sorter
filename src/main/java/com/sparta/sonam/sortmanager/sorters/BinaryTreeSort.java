package com.sparta.sonam.sortmanager.sorters;

public class BinaryTreeSort implements Sorter {
    private final String name;

    public BinaryTreeSort(){
        this.name = "BinaryTreeSort";
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return new int[0];
    }

    @Override
    public String getName() {
        return name;
    }
}
