package com.sparta.sonam.sortmanager.arraygenerator;

import java.util.Random;

public class GenerateRandomArray {
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
