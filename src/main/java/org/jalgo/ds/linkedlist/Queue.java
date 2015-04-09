package org.jalgo.ds.linkedlist;

public class Queue {
	
	ListNode start = null;
	ListNode end = null;
	
	public void enqueue(Object v) {
		if (start == null) {
			start = new ListNode(v);
			end = start;
		} else {
			ListNode n = new ListNode(v);
			end.next = n;
			end = n;
		}
	}
	
	public Object dequeue() {
		if (start == null) 
			return null;
		else {
			ListNode n = start;
			start = start.next;
			return n.value;
		}
	}
	
	public void print() {
		ListNode t = start;
		if (t == null) {
			System.out.println("Queue empty"); 
		} 
		
		while (t != null) {
			System.out.println(t.value);
			t = t.next;
		}
	}
	
	public static void main(String args[]) {
		Queue q = new Queue();
		q.enqueue(2);
		q.enqueue(1);
		q.enqueue(1);
		q.dequeue();
		
		q.print();
		
		q = new Queue();
		q.print();

		q = new Queue();
		q.enqueue(1);
		q.print();
		
		q = new Queue();
		q.enqueue(1);
		q.dequeue();
		q.print();
	}
}
