package com.sparta.sonam.sortmanager.sorters;

public class QuickSort implements Sorter{
    private final String name;

    public QuickSort(){
        this.name = "QuickSort";
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
