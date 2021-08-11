package com.sparta.sonam.sortmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sorter sortingAlgorithm;
        int[] arrayToSort;
        int arrayLength,chosenSortingAlgorithm;

        do{
            View.printSortingOptions();

            Scanner input = new Scanner(System.in);
            chosenSortingAlgorithm = input.nextInt();

            View.printArrayLengthStatement();

            arrayLength = input.nextInt();
            arrayToSort = SortFactory.generateRandomArray(arrayLength);

            sortingAlgorithm = SortFactory.getSortingAlgorithm(chosenSortingAlgorithm);
            if(sortingAlgorithm==null) {
                System.out.println("Wrong number provided. Please try again.");
            }
        }while(sortingAlgorithm==null);
        View.printArray(arrayToSort);
        sortingAlgorithm.sortArray(arrayToSort);
    }
}
