package com.sparta.sonam.sortmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        View.printSortingOptions();

        Scanner input = new Scanner(System.in);
        int chosenSortingAlgorithm = input.nextInt();

        View.printArrayLengthStatement();

        int arrayLength = input.nextInt();
        int[] arrayToSort = SortFactory.generateRandomArray(arrayLength);

        View.printArray(arrayToSort);

        Sorter sortingAlgorithm = SortFactory.getSortingAlgorithm(chosenSortingAlgorithm);
        sortingAlgorithm.sortArray(arrayToSort);
    }
}
