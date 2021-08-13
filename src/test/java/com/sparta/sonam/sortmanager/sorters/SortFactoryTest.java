package com.sparta.sonam.sortmanager.sorters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("SortFactory should provide the correct sorting algorithms to View and return correct sorting algorithm according to int provided")
class SortFactoryTest {

    @Test
    @DisplayName("Correct int provided. should return correct Sorter.")
    void getSortingAlgorithmReturnsCorrectSorter(){
        String actualSorter = new BubbleSort().getName();
        String expectedSorter = SortFactory.getSortingAlgorithm(1).getName();

        Assertions.assertEquals(expectedSorter, actualSorter);
    }

    @Test
    @DisplayName("Incorrect int provided. should return null.")
    void getSortingAlgorithmReturnsNull(){
        Sorter expectedSorter = SortFactory.getSortingAlgorithm(8);

        Assertions.assertNull(expectedSorter);
    }

    @Test
    @DisplayName("Correct sorting options displayed.")
    void getSortingOptions() {
        String[] sortingOptions = new String[] {
                "BubbleSort", "BinaryTreeSort"
        };
        String actualSorters = Arrays.toString(sortingOptions);
        String expectedSorters = Arrays.toString(SortFactory.getSortingOptions());
        Assertions.assertEquals(actualSorters, expectedSorters);
    }

    @Test
    @DisplayName("Sorting option 2 exists, should return true.")
    void hasSortingOptionTrue() {
        Assertions.assertTrue(SortFactory.hasSortingOption(2));
    }

    @Test
    @DisplayName("Sorting option 8 does not exists, should return false.")
    void hasSortingOptionFalse() {
        Assertions.assertFalse(SortFactory.hasSortingOption(8));
    }
}