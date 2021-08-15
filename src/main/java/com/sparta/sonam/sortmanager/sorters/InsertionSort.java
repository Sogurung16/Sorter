package com.sparta.sonam.sortmanager.sorters;

public class InsertionSort implements Sorter{
    private final String name;

    public InsertionSort(){
        this.name = "InsertionSort";
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
