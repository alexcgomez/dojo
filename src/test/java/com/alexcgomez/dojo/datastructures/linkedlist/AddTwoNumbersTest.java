package com.alexcgomez.dojo.datastructures.linkedlist;


import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/

class AddTwoNumbersTest {

    AddTwoNumbersSolution addTwoNumbersSolution = new AddTwoNumbersSolution();

    private void assertLinkedListEquals(@NotNull ListNode expected, @NotNull ListNode actual) {
        do {
            assertEquals(expected.val, actual.val);
            if (actual.hasNext()) {
                actual = actual.next;
            }
            expected = expected.next;
        } while (expected != null);
    }

    @Test
    void ShouldReturnListNodeWithValueZeroIfAllInputsAreZero() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode expectedResult = new ListNode(0);
        ListNode result = addTwoNumbersSolution.addTwoNumbers(l1, l2);

        assertLinkedListEquals(expectedResult, result);
    }

    @Test
    void ShouldReturnExpectedListNodeWhenListNodeInputAreSameSize() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode expectedResult = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode result = addTwoNumbersSolution.addTwoNumbers(l1, l2);

        assertLinkedListEquals(expectedResult, result);
    }

    @Test
    void ShouldReturnExpectedListNodeWhenListNodeInputHaveDifferentSizes() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        //8,9,9,9,0,0,0,1
        ListNode expectedResult = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        ListNode result = addTwoNumbersSolution.addTwoNumbers(l1, l2);

        assertLinkedListEquals(expectedResult, result);
    }
}