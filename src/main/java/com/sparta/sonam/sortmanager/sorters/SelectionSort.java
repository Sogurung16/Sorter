package com.sparta.sonam.sortmanager.sorters;

public class SelectionSort implements Sorter{
    private final String name;

    public SelectionSort(){
        this.name = "SelectionSort";
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return getSelectionSortedArray(arrayToSort);
    }

    private int[] getSelectionSortedArray(int[] arrayToSort){
        selectionSort(arrayToSort);
        int[] sortedArray = arrayToSort;
        return sortedArray;
    }

    private void selectionSort(int[] arrayToSort){
        int temp;
        for(int i = 0; i < arrayToSort.length; i++){
            for(int j = i+1; j < arrayToSort.length; j++){
                if(arrayToSort[j]<arrayToSort[i]){
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
