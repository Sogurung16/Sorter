package com.sparta.sonam.sortmanager.sorters;

public class SelectionSort implements Sorter{
    private final String name;

    public SelectionSort(){
        this.name = "SelectionSort";
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
