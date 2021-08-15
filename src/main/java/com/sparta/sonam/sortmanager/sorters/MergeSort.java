package com.sparta.sonam.sortmanager.sorters;

public class MergeSort implements Sorter{
    private final String name;

    public MergeSort(){
        this.name = "MergeSort";
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return getMergeSortedArray(arrayToSort);
    }

    private int[] getMergeSortedArray(int[] arrayToSort){
        mergeSort(arrayToSort, 0, arrayToSort.length-1);
        int[] sortedArray = arrayToSort;
        return sortedArray;
    }

    private void mergeSort(int[] array , int left, int right){
        if(left<right){
            int middle = (left + (right - 1))/2;
            mergeSort(array, left, middle);
            mergeSort(array, middle+1, right);
            merge(array, left, middle, right);
        }
    }

    private void merge(int[] array , int left, int middle,int right){
        int leftArraySize = middle - left + 1;
        int rightArraySize = right - middle;

        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        for(int i = 0; i< leftArray.length; i++){
            leftArray[i] = array[left + i];
        }
        for(int i = 0; i< leftArray.length; i++){
            rightArray[i] = array[middle+1+i];
        }

        int mergedArrayIndex = left;
        int leftArrayIndex = 0, rightArrayIndex = 0;

        while(leftArrayIndex<leftArraySize && rightArrayIndex<rightArraySize){
            if(leftArray[leftArrayIndex] < rightArray[rightArrayIndex]){
                array[mergedArrayIndex] = leftArray[leftArrayIndex];
                leftArrayIndex++;
            }
            else{
                array[mergedArrayIndex] = rightArray[rightArrayIndex];
                rightArrayIndex++;
            }
            mergedArrayIndex++;
        }

        while(leftArrayIndex<leftArraySize){
            array[mergedArrayIndex] = leftArray[leftArrayIndex];
            leftArrayIndex++;
            mergedArrayIndex++;
        }
        while(rightArrayIndex<rightArraySize){
            array[mergedArrayIndex] = rightArray[rightArrayIndex];
            rightArrayIndex++;
            mergedArrayIndex++;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
