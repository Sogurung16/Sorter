package com.sparta.sonam.sortmanager.sorters;

public class BubbleSort implements Sorter {
    private final String name;

    public BubbleSort(){
        this.name = "BubbleSort";
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
