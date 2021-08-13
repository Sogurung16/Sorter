package com.sparta.sonam.sortmanager.sorters;

public class BubbleSort implements Sorter {
    private final String name;

    public BubbleSort(){
        this.name = "BubbleSort";
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return getBubbleSortedArray(arrayToSort);
    }

    private int[] getBubbleSortedArray(int[] arrayToSort){
        int temp;
        for(int i = arrayToSort.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arrayToSort[j]>arrayToSort[j+1]){
                    temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temp;
                }
            }
        }
        int[] sortedArray = arrayToSort;
        return sortedArray;
    }

    @Override
    public String getName() {
        return name;
    }
}
