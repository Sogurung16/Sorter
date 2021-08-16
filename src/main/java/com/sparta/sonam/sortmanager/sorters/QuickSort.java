package com.sparta.sonam.sortmanager.sorters;

public class QuickSort implements Sorter {
    private final String name;

    public QuickSort() {
        this.name = "QuickSort";
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return getQuickSortedArray(arrayToSort);
    }

    private int[] getQuickSortedArray(int[] arrayToSort) {
        quickSort(arrayToSort, 0, arrayToSort.length - 1);
        int[] sortedArray = arrayToSort;
        return sortedArray;
    }

    private void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = getPivotIndex(array, left, right);
            quickSort(array, left, pivot - 1);
            quickSort(array, pivot + 1, right);
        }
    }

    private int getPivotIndex(int[] array, int left, int right) {
        int pivotIndex = array[left];
        int temp;

        int i = right+1;

        for (int j = right; j >= left+1; j--) {
            if (array[j] > pivotIndex) {
                i--;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        temp = array[i - 1];
        array[i - 1] = array[left];
        array[left] = temp;

        return i - 1;
    }

    @Override
    public String getName() {
        return name;
    }
}
