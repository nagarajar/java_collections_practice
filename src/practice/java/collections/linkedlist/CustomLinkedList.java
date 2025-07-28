package practice.java.collections.linkedlist;

public class CustomLinkedList {
	//1. What is the Data Structure of LinkedList(LL)
	//ans: its Node --> which includes data(Object) and next(Node - next node reference)
	class Node {
		Object data;
		Node next;
	}
	
	//2. In LL there will be first and last node, first - Head, last - Tail (will be node with next value null)
	Node head = null;
	
	//3. Create add method
	public void add(Object o) {
		//3.1 If you observe add method in LL which accept the data value
		// so its not type node then we need to create the Node obj first
		Node n = new Node();
		//3.2 set the data
		n.data = o;
		//3.3 check the first node null
		if(head==null) {
			head=n;
		} else {
		//3.4 We need to update the next node reference to the previous node once new element is added
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next; //get the next node 
			}
			temp.next=n; //Assign the next node reference where next is null
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "[";
		//3.3 check the first node null
		if(head==null) {
			s=s+"";
		} else {
		//3.4 We need to update the next node reference to the previous node once new element is added
			Node temp = head;
			s=s+temp.data;	
			while(temp.next!=null) {
				temp = temp.next; //get the next node 
				s=s+", "+temp.data;	
			}
		}
		s=s+"]";
		return s;
	}
	
}
