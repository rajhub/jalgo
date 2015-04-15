package org.jalgo.ds.linkedlist;

import java.util.Stack;

public class ListPalindrome {
    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        Stack<Integer> stack = new Stack<Integer>();

        /* Push elements from first half of linked list onto stack. When
         * fast runner (which is moving at 2x speed) reaches the end of
         * the linked list, then we know we're at the middle
         */
        while (fast != null && fast.next != null) {
            stack.push((Integer) slow.value);
            slow = slow.next;
            fast = fast.next.next;
        }

         /* Has odd number of elements, so skip the middle element */
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            int top = stack.pop();

                /* If values are different, then it's not a palindrome */
            if (top != (Integer) slow.value) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

}
