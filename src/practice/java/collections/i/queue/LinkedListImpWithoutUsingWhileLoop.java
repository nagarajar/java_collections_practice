package practice.java.collections.i.queue;

import java.util.StringJoiner;

public class LinkedListImpWithoutUsingWhileLoop {
	
	class Node {
		Object data;
		Node next;
		
		Node(Object data){
			this.data = data;
		}
	}
	
	Node head = null;
	Node tail = null;
	
	//1. add elements to linked list
	public void add(Object o) {
		Node n = new Node(o);
		if(head==null) {
			head=n;
			tail=n;
		} else {
			tail.next = n;
			tail=n;
		}
	}
	
	public Object getFirstElement() {
		return head.data;
	}
	
	public Object getLastElement() {
		return tail.data;
	}
	
	// Ovveride toString
	@Override
	public String toString() {
		StringJoiner sj = new StringJoiner(", ","[", "]");
		if(head!=null) {
			Node temp = head;
			while(temp !=null) {
				sj.add(temp.data.toString());
				temp = temp.next;
			}
		}	
		return sj.toString();
	}
}
