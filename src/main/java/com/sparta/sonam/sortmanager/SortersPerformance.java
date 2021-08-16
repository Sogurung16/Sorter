package com.sparta.sonam.sortmanager;

import com.sparta.sonam.sortmanager.sorters.SortFactory;
import com.sparta.sonam.sortmanager.sorters.Sorter;

import java.util.Arrays;
import java.util.logging.Logger;

public class SortersPerformance {
    private static Logger logger = Logger.getLogger("Sorter");

    static int[] unsortedArray = new int[]{24, 5, 2, 19, 67, 78, 59, 99};

    public static void logPerformance(){
        logger.info("Time taken for each algorithm to sort array " + Arrays.toString(unsortedArray));
        for(int i = 1; i <= SortFactory.getSortingOptions().length; i ++){
            Sorter sorter = SortFactory.getSortingAlgorithm(i);
            long start = System.nanoTime();
            sorter.sortArray(unsortedArray);
            long end = System.nanoTime();
            long timeTaken = end - start;

            logger.info(sorter.getName() + " algorithm: " + timeTaken + " nanoseconds");
        }
    }
}
