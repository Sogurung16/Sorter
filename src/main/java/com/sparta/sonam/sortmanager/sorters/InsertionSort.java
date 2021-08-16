package com.sparta.sonam.sortmanager.sorters;

public class InsertionSort implements Sorter{
    private final String name;

    public InsertionSort(){
        this.name = "InsertionSort";
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return getInsertionSortedArray(arrayToSort);
    }

    private int[] getInsertionSortedArray(int[] arrayToSort){
        insertionSort(arrayToSort);
        int[] sortedArray = arrayToSort;
        return sortedArray;
    }

    private void insertionSort(int[] arrayToSort){
        for(int i = 0; i< arrayToSort.length; i++) {
            int position = i;
            for(int j = position; j>=0; j--){
                if(arrayToSort[position] < arrayToSort[j]){
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[position];
                    arrayToSort[position] = temp;
                    position--;
                }
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
