package org.jalgo.ds.linkedlist;

import java.util.Hashtable;

public class DeleteDuplicates {
    public static void deleteDups(ListNode n) {
        Hashtable table = new Hashtable();
        ListNode previous = null;
        while (n != null) {
            if (table.containsKey(n.value)) {
                previous.next = n.next;
            } else {
                table.put(n.value, true);
                previous = n;
            }
            n = n.next;
        }
    }

    public static void deleteDups2(ListNode head) {
        if (head == null) return;

        ListNode current = head;
        while (current != null) {
             /* Remove all future nodes that have the same value */
            ListNode runner = current;
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}
