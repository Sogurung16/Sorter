package com.sparta.sonam.sortmanager.sorters;

import com.sparta.sonam.sortmanager.arraygenerator.GenerateRandomArray;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@Description("Should BubbleSort the provided array in ascending order.")
class BubbleSortTest {

    @Test
    @Description("Returns a BubbleSorted array of length 20")
    void sortArray() {
        int[] unsortedArray = new int[]{99,24,59,5,2,19,67,78};

        int[] expectedSortedArray = new int[]{2,5,19,24,59,67,78,99};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(1).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }
}