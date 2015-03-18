package org.jalgo.ds;

public class Queue {
	
	Node start = null;
	Node end = null;
	
	public void enqueue(Object v) {
		if (start == null) {
			start = new Node(v);
			end = start;
		} else {
			Node n = new Node(v);
			end.next(n);
			end = n;
		}
	}
	
	public Object dequeue() {
		if (start == null) 
			return null;
		else {
			Node n = start;
			start = start.next();
			return n.value();
		}
	}
	
	public void print() {
		Node t = start;
		if (t == null) {
			System.out.println("Queue empty"); 
		} 
		
		while (t != null) {
			System.out.println(t.value());
			t = t.next();
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
