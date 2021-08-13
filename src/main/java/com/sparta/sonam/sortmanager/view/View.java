package com.sparta.sonam.sortmanager.view;

import com.sparta.sonam.sortmanager.sorters.Sorter;
import java.util.Arrays;

public class View {
    public static void printSortingOptions(String[] sorterOptions){
        System.out.println("Please select from the list of numbered sorting algorithms by their respective number: ");

        for(int i = 1; i <= sorterOptions.length; i++){
            System.out.println(i + ". " + sorterOptions[i-1]);
        }
    }

    public static void printArrayLengthStatement(){
        System.out.println("Please provide the length of the array to sort: ");
    }

    public static void printIncorrectNumber(){
        System.out.println("\n" + "Wrong number provided. Please try again." + "\n");
    }

    public static void printChosenSorter(Sorter sorter){
        System.out.println("\n" + "Sorting Algorithm: " + sorter.getName()+ "\n");
    }

    // \n is implemented to provide better readability in the command line
    public static void printUnsortedArray(int[] unsortedArray){
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(unsortedArray) + "\n");
    }

    public static void printSortedArray(int[] sortedArray){
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(sortedArray) + "\n");
    }

    public static void printTimeTaken(long timeTaken, Sorter sortingAlgorithm){
        System.out.println("Time taken for " + sortingAlgorithm.getName() + " algorithm = " + timeTaken + " nanoseconds\n");
    }
}
