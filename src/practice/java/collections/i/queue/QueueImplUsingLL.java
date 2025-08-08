package practice.java.collections.i.queue;

import java.util.StringJoiner;

public class QueueImplUsingLL {
	//Initial properties
	class Node {
		Object data;
		Node next;
		
		Node(Object data){
			this.data=data;
		}
	}
	
	Node head = null;
	
	//add
	public void add(Object o) {
		Node n = new Node(o);
		if(head==null) {
			head=n;
		} else {
			Node temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	
	//peek
	public Object peek() {
		if(head==null) return null;
		return head.data;
	}
	
	//poll
	public Object poll() {
		if(head==null) return null;
		Object removed = head.data;
		Node temp = head;
		head = temp.next;
		temp.next = null;
		return removed;
	}
	
	@Override
	public String toString() {
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		Node temp = head;
		while(temp!=null) {
			sj.add(temp.data.toString());
			temp=temp.next;
		}
		return sj.toString();
	}
}
