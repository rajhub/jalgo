package org.jalgo;

import org.jalgo.ds.Node;

public class ReverseLinkedList {
	
	public static void print(Node node) {
		if (node == null) {
			System.out.println("List empty"); 
		} 
		
		while (node != null) {
			System.out.println(node.value());
			node = node.next();
		}
	}
	
	public static Node reverse(Node node) {
		
		Node current = node;
		Node prev = null;
		Node next = null;
		
		while(current != null) {
			next = current.next();
			current.next(prev);
			prev = current;
			current = next;
		}
		
		return prev;
	}
	
	public static void main(String args[]) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		n1.next(n2);
		n2.next(n3);
		n3.next(n4);
		n4.next(n5);
		
		print(n1);
		print(reverse(n1));
		
	}
}
