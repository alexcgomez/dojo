package com.alexcgomez.dojo.algorithms;

import java.util.ArrayList;
import java.util.Objects;

public class BinarySearch implements SearchAlgorithm {

    @Override
    public Integer search(ArrayList<Integer> inputArray, Integer target) {
        int leftPointer = 0;
        int rightPointer = inputArray.size() - 1;
        int middlePointer;

        while (leftPointer <= rightPointer) {
            middlePointer = (leftPointer + rightPointer) / 2;
            if (Objects.equals(inputArray.get(middlePointer), target)) {
                return middlePointer;
            } else if (target < inputArray.get(middlePointer)) {
                rightPointer = middlePointer - 1;
            } else {
                leftPointer = middlePointer + 1;
            }
        }
        return -1;
    }
}
