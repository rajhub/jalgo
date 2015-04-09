package org.jalgo.ds.linkedlist;

public class NthToLast {

    ListNode nthToLast(ListNode head, int k) {
        if (k <= 0) return null;

        ListNode p1 = head;
        ListNode p2 = head;

        // Move p2 -forward k nodes into the list.
        for (int i = 0; i < k - 1; i++) {
            if (p2 == null) return null; // Error check
            p2 = p2.next;
        }
        if (p2 == null) return null;

         /* Now, move p1 and p2 at the same speed. When p2 hits the end, p1 will be at the right element. */
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
