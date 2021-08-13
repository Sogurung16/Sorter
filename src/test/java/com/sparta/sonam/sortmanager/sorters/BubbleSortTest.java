package com.sparta.sonam.sortmanager.sorters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;

@DisplayName("Should BubbleSort the provided array in ascending order.")
class BubbleSortTest {

    @RepeatedTest(10)
    @DisplayName("Returns a BubbleSorted array of length 20")
    void bubbleSortArrayTest() {
        int[] unsortedArray = new int[]{99,24,59,5,2,19,67,78};

        int[] expectedSortedArray = new int[]{2,5,19,24,59,67,78,99};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(1).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }
}