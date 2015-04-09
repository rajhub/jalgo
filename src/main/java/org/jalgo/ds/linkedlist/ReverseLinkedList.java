package org.jalgo.ds.linkedlist;

public class ReverseLinkedList {
	
	public static void print(ListNode listNode) {
		if (listNode == null) {
			System.out.println("List empty"); 
		} 
		
		while (listNode != null) {
			System.out.println(listNode.value);
			listNode = listNode.next;
		}
	}
	
	public static ListNode reverse(ListNode listNode) {
		
		ListNode current = listNode;
		ListNode prev = null;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		return prev;
	}
	
	public static void main(String args[]) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		print(n1);
		print(reverse(n1));
		
	}
}
