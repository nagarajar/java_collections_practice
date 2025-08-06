package practice.java.collections.g.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMainClass {
	public static void main(String[] args) {
		// 1. Create the linked list and add the elements then print it.
		List<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		
		System.out.println("************************************************");
		//2. Now we need to create the custom linked list like LinkedList
		//3. Create the CustomLinkedList class then check what is the Data Structure(DS) of LinkedList
		//4. Create a add method to add the elements like LinkedList
		CustomLinkedList cll = new CustomLinkedList();
		cll.add(10);
		cll.add(20);
		cll.add(30);
		cll.add(40);
		cll.add(50);
		System.out.println(cll);
		cll.addBeforeHead(5);
		System.out.println(cll);
		cll.addAfterSpecificElement(7, 5); //add 7 after head
		System.out.println(cll);
		cll.addAfterSpecificElement(15, 10); //add 15 after the 10
		System.out.println(cll);
		cll.addAfterSpecificElement(60, 50); //add 60 after the last
		System.out.println(cll);
		//There are 3 conditions we have handle while removing
		//1. if the remove element is at head
		cll.remove(5);
		System.out.println(cll);
		//2. if the remove element is in mid
		cll.remove(30);
		System.out.println(cll);
		//3. if the remove element is at last
		cll.remove(50);
		System.out.println(cll);
	}
}
