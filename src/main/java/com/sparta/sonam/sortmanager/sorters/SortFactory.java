package com.sparta.sonam.sortmanager.sorters;

import com.sparta.sonam.sortmanager.sorters.binarysorttree.BinarySortTree;

public class SortFactory {
    public static Sorter getSortingAlgorithm(int sortAlgorithm){
        return switch(sortAlgorithm){
            case 1 -> new BubbleSort();
            case 2 -> new BinarySortTree();
            default -> null;
        };
    }

    public static final String[] getSortingOptions(){
        String[] sorterOptions = new String[]{
          new BubbleSort().getName(),
          new BinarySortTree().getName()
        };
        return sorterOptions;
    }

    public static boolean hasSortingOption(int sortingOption){
        return sortingOption>getSortingOptions().length?false:true;
    }
}
