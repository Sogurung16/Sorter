package com.sparta.sonam.sortmanager.sorters.binarysorttree;

import com.sparta.sonam.sortmanager.sorters.SortFactory;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Description("BinaryTreeSort the provided array")
class BinarySortTreeTest {
    @Test
    @Description("Returns a BinarySortedTree array for length 20")
    void binarySortTreeArrayTest(){
        int[] unsortedArray = new int[]{99,24,59,5,2,19,67,78};

        int[] expectedSortedArray = new int[]{2,5,19,24,59,67,78,99};
        int[] actualSortedArray = SortFactory.getSortingAlgorithm(2).sortArray(unsortedArray);

        String expectedArray = Arrays.toString(expectedSortedArray);
        String actualArray = Arrays.toString(actualSortedArray);

        Assertions.assertEquals(expectedArray, actualArray);
    }
}