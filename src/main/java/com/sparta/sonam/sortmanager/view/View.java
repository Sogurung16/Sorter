package com.sparta.sonam.sortmanager.view;

import java.util.ArrayList;
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

    public static void printUnsortedArray(int[] unsortedArray){
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static void printIncorrectNumber(){
        System.out.println("Wrong number provided. Please try again.");
    }
}
