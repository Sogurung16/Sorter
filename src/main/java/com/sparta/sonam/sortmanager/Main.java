package com.sparta.sonam.sortmanager;

import com.sparta.sonam.sortmanager.arraygenerator.GenerateRandomArray;
import com.sparta.sonam.sortmanager.sorters.SortFactory;
import com.sparta.sonam.sortmanager.sorters.Sorter;
import com.sparta.sonam.sortmanager.view.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sorter sortingAlgorithm;
        int[] arrayToSort, sortedArray;
        int arrayLength,chosenSortingAlgorithm;

        do{
            View.printSortingOptions(SortFactory.getSortingOptions());

            Scanner inputSorter = new Scanner(System.in);
            chosenSortingAlgorithm = inputSorter.nextInt();

            sortingAlgorithm = SortFactory.getSortingAlgorithm(chosenSortingAlgorithm);
            if(!SortFactory.hasSortingOption(chosenSortingAlgorithm)) {
                View.printIncorrectNumber();
            }
        }while(sortingAlgorithm==null);

        View.printArrayLengthStatement();
        Scanner inputArrLength = new Scanner(System.in);
        arrayLength = inputArrLength.nextInt();

        View.printChosenSorter(sortingAlgorithm);

        long start = System.nanoTime();
        arrayToSort = GenerateRandomArray.generateRandomArray(arrayLength);
        View.printUnsortedArray(arrayToSort);

        sortedArray = sortingAlgorithm.sortArray(arrayToSort);
        View.printSortedArray(sortedArray);
        long finish = System.nanoTime();
        long timeTaken = finish - start;

        View.printTimeTaken(timeTaken, sortingAlgorithm);
    }
}
