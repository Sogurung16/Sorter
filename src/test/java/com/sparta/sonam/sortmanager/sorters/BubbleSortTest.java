package com.sparta.sonam.sortmanager.sorters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("Should BubbleSort the provided array in ascending order.")
class BubbleSortTest {
    @Test
    @DisplayName("Returns a BubbleSorted array of length 20")
    void bubbleSortArrayTest() {
        int[] unsortedArray = new int[]{99,24,59,5,2,19,67,78};

        int[] expectedSortedArray = new int[]{2,5,19,24,59,67,78,99};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(1).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }

    @Test
    @DisplayName("Returns a BubbleSorted array for length 20. Test for value zero in array")
    void bubbleSortArrayWithZeroTest(){
        int[] unsortedArray = new int[]{24,5,2,0,67,78,59,99};

        int[] expectedSortedArray = new int[]{0,2,5,24,59,67,78,99};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(1).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }

    @Test
    @DisplayName("Returns a BubbleSorted array for length 20. Test for negative values in array")
    void bubbleSortArrayWithNegativesTest(){
        int[] unsortedArray = new int[]{24,5,2,-67,78,-59,99};

        int[] expectedSortedArray = new int[]{-67,-59,2,5,24,78,99};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(1).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }

    @Test
    @DisplayName("Returns a BubbleSorted array for length 20. Test for repeated values in array")
    void bubbleSortArrayWithRepeatsTest(){
        int[] unsortedArray = new int[]{19,5,2,67,19,67,19,99};

        int[] expectedSortedArray = new int[]{2,5,19,19,19,67,67,99};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(1).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }
}