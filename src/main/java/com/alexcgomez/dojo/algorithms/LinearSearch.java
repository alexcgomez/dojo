package com.alexcgomez.dojo.algorithms;

import java.util.ArrayList;
import java.util.Objects;

public class LinearSearch {

    public Integer search(ArrayList<Integer> inputArray, Integer target) {

        for (int i = 0; i < inputArray.size(); i++) {
            if (Objects.equals(inputArray.get(i), target)) {
                return i;
            }
        }
        return -1;
    }
}
