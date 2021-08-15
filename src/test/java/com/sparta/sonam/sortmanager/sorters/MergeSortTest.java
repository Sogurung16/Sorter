package com.sparta.sonam.sortmanager.sorters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("Should MergeSort the provided array in ascending order")
class MergeSortTest implements SortersTestInterface{
    @Override
    @Test
    @DisplayName("Returns a MergeSorted array")
    public void sortArrayTest() {
        int[] unsortedArray = new int[]{24,5,2,19,67,78,59,99};

        int[] expectedSortedArray = new int[]{2,5,19,24,59,67,78,99};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(3).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }

    @Override
    @Test
    @DisplayName("Returns a MergeSorted array. Test for value zero in array")
    public void sortArrayWithZeroTest(){
        int[] unsortedArray = new int[]{24,5,2,0,67,78,59,99};

        int[] expectedSortedArray = new int[]{0,2,5,24,59,67,78,99};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(3).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }

    @Override
    @Test
    @DisplayName("Returns a MergeSorted array. Test for negative values in array")
    public void sortArrayWithNegativesTest(){
        int[] unsortedArray = new int[]{24,5,2,-67,78,-59,99,-40};

        int[] expectedSortedArray = new int[]{-67,-59,-40,2,5,24,78,99};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(3).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }

    @Override
    @Test
    @DisplayName("Returns a MergeSorted array. Test for repeated values in array")
    public void sortArrayWithRepeatsTest(){
        int[] unsortedArray = new int[]{19,5,2,67,19,67,19,99};

        int[] expectedSortedArray = new int[]{2,5,19,19,19,67,67,99};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(3).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }

    @Override
    @Test
    @DisplayName("Returns a MergeSorted even size array of length 8")
    public void sortArrayOfEvenSize(){
        int[] unsortedArray = new int[]{24,5,2,19,67,78,59,99};

        int[] expectedSortedArray = new int[]{2,5,19,24,59,67,78,99};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(3).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }

    @Override
    @Test
    @DisplayName("Returns a MergeSorted odd size array of length 7")
    public void sortArrayOfOddSize(){
        int[] unsortedArray = new int[]{24,5,2,19,67,78,59};

        int[] expectedSortedArray = new int[]{2,5,19,24,59,67,78};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(3).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }
}