package com.sparta.sonam.sortmanager.sorters;

public class MergeSort implements Sorter{
    private final String name;

    public MergeSort(){
        this.name = "MergeSort";
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return new int[0];
    }

    private int[] getMergeSortedArray(int[] arrayToSort, int left, int right){
        if(right>left){

        }

        return new int[0];
    }

    @Override
    public String getName() {
        return name;
    }
}
