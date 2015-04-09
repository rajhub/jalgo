package org.jalgo.ds.linkedlist;

/**
 * Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.
 */
public class ListPartition {

    /* Pass in the head of the linked list and the value to partition around */
    public ListNode partition(ListNode node, int x) {
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;

        /* Partition list */
        while (node != null) {
            ListNode next = node.next;
            node.next = null;
            if ((Integer) node.value < x) {
                 /* Insert node into end of before list */
                if (beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            } else {
                 /* Insert node into end of after list */
                if (afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = next;
        }

        if (beforeStart == null) {
            return afterStart;
        }

         /* Merge before list and after list */
        beforeEnd.next = afterStart;
        return beforeStart;
    }
}
