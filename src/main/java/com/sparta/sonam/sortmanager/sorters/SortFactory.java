package com.sparta.sonam.sortmanager.sorters;

import com.sparta.sonam.sortmanager.sorters.binarysorttree.BinarySearchTree;
import com.sparta.sonam.sortmanager.sorters.binarysorttree.BinarySearchTreeSort;

public class SortFactory {
    public static Sorter getSortingAlgorithm(int sortAlgorithm){
        return switch(sortAlgorithm){
            case 1 -> new BubbleSort();
            case 2 -> new InsertionSort();
            case 3 -> new MergeSort();
            case 4 -> new QuickSort();
            case 5 -> new SelectionSort();
            case 6 -> new BinarySearchTreeSort();
            default -> null;
        };
    }

    public static final String[] getSortingOptions(){
        String[] sorterOptions = new String[]{
            new BubbleSort().getName(),
            new InsertionSort().getName(),
            new MergeSort().getName(),
            new QuickSort().getName(),
            new SelectionSort().getName(),
            new BinarySearchTreeSort().getName()
        };
        return sorterOptions;
    }

    public static boolean hasSortingOption(int sortingOption){
        return sortingOption>getSortingOptions().length?false:true;
    }
}
