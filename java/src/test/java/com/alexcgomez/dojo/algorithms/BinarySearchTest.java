package com.alexcgomez.dojo.algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    ArrayList<Integer> inputArray = new ArrayList<>(Arrays.asList(-2, 3, 4, 7, 8, 9, 11, 13));
    BinarySearch binarySearch = new BinarySearch();

    @Test
    void ShouldReturnTheTargetIndex() {
        Integer target = 11;
        Integer expectedIndex = 6;
        Integer targetIndex = binarySearch.search(inputArray, target);

        assertEquals(expectedIndex, targetIndex);
    }

}