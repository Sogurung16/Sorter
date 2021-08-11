package com.sparta.sonam.sortmanager;

import java.util.ArrayList;
import java.util.Arrays;

public class View {
    public static void printSortingOptions(){
        System.out.println("Please select from the list of numbered sorting algorithms by their respective number: ");
        String[] sortingAlgorithms = {
                "BubbleSort",
                "YetToImplement",
                "YetToImplement",
                "YetToImplement",
                "YetToImplement",
                "YetToImplement",
                "BinaryTreeSort",
        };

        for(int i = 1; i <= sortingAlgorithms.length; i++){
            System.out.println(i + ". " + sortingAlgorithms[i-1]);
        }
    }

    public static void printArrayLengthStatement(){
        System.out.println("Please provide the length of the array to sort: ");
    }

    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
