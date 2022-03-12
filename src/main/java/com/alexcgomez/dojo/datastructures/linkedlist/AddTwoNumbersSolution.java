package com.alexcgomez.dojo.datastructures.linkedlist;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbersSolution {
    public ListNode addTwoNumbers(@NotNull ListNode l1, @NotNull ListNode l2) {

        int[] l1Array = toArray(l1);
        int[] l2Array = toArray(l2);

        int resultSize = Math.max(l1Array.length, l2Array.length);
        int[] result = new int[resultSize];

        for (int i = 0; i < resultSize; i++) {
            if (i < l1Array.length) {
                if (i < l2Array.length){
                    result[i] += l2Array[i] + l1Array[i];
                    if (result[i] >= 10) {
                            result[i] = 0;
                            if (i+1 == resultSize){
                                result[i] = 1;
                            } else {
                                result[i+1] = 1;
                            }
                    }
                }
                else {
                    result[i] += l1Array[i];
                }
            } else {
                result[i] += l2Array[i];
            }
        }

        return toListNode(result);
    }


    private ListNode insert(ListNode root, int item) {
        ListNode temp = new ListNode();
        temp.val = item;
        temp.next = root;
        root = temp;
        return root;
    };

    private ListNode toListNode(int[] array) {
        ListNode listNode = new ListNode();

        for (int i = array.length - 1; i >= 0 ; i--) {
            listNode = insert(listNode, array[i]);
        }
        return listNode;
    }

    private int[] toArray(ListNode l1) {
        ListNode aux = l1;
        int length = 0;
        do {
            l1 = l1.next;
            length++;
        } while (l1 != null);

        int[] values = new int[length];
        int i = 0;

        do {
            values[i] = aux.val;
            aux = aux.next;
            i++;
        } while (aux != null);

        return values;
    }
}
