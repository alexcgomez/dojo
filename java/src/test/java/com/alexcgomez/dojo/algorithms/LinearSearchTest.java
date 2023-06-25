package com.alexcgomez.dojo.algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinearSearchTest {

    ArrayList<Integer> inputArray = new ArrayList<>(Arrays.asList(-2, 3, 4, 7, 8, 9, 11, 13));
    LinearSearch linearSearch = new LinearSearch();

    @Test
    void ShouldReturnTheTargetIndex() {

        Integer target = 11;
        Integer expectedIndex = 6;
        Integer index = linearSearch.search(inputArray, target);


        assertEquals(expectedIndex, index);
    }

    @Test
    void ShouldReturnMinusOneIfTargetDoesNotExist() {

        Integer unexistentTarget = 99;
        Integer expectedIndex = -1;
        Integer index = linearSearch.search(inputArray, unexistentTarget);


        assertEquals(expectedIndex, index);
    }

}