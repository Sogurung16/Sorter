package com.sparta.sonam.sortmanager.sorters.binarysorttree;

import com.sparta.sonam.sortmanager.sorters.SortFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;

@DisplayName("BinaryTreeSort the provided array")
class BinarySearchTreeSortTest {
    @RepeatedTest(10)
    @DisplayName("Returns a BinarySortedTree array for length 20")
    void binarySortTreeArrayTest(){
        int[] unsortedArray = new int[]{99,24,59,5,2,19,67,78};

        int[] expectedSortedArray = new int[]{2,5,19,24,59,67,78,99};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(2).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }
}