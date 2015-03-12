package org.jalgo.ds;

public class Node {
	Object value;
	Node next;
	
	public Node(Object v) {
		value = v;
	}
	
	public void next(Node n) {
		next = n;
	}
	
	public Node next() {
		return next;
	}
	
	public Object value() {
		return value;
	}
}
