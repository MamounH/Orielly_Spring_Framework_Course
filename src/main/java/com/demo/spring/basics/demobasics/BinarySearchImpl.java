package com.demo.spring.basics.demobasics;

public class BinarySearchImpl {

    SortingAlgo sortingAlgo;

    public BinarySearchImpl(SortingAlgo sortingAlgo){
        this.sortingAlgo=sortingAlgo;
    }

    public int binarySearch(int[] numbers , int numberToSearchFor){

        int[] sortedNums = sortingAlgo.sort(numbers);
        return 3;

    }


}
