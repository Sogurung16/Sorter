package com.sparta.sonam.sortmanager;

import java.util.Random;

public class SortFactory {
    public static Sorter getSortingAlgorithm(int sortAlgorithm){
        return switch(sortAlgorithm){
            case 1 -> new BubbleSort();
            case 7 -> new BinaryTreeSort();
            default -> null;
        };
    }

    public static int[] generateRandomArray(int arrayLength){
        Random random = new Random();

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++){
            int randomNumber = random.nextInt(100);
            array[i] = randomNumber;
        }

        return array;
    }
}
