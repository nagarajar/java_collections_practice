package practice.java.collections.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class UseCustomLinkedList {
	
	public static void main(String[] args) {
		
		List<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		System.out.println("Linked List: "+ll);
//		System.out.println("Insert before head: "+ll.removeFirst());
		System.out.println("get(1): "+ll.get(1));
		System.out.println("contains(10): "+ll.contains(10));
		System.out.println("Rmeove (10): "+ll.remove(2));
	
		
		System.out.println("***********************************************");
		
		CustomLinkedList customLinkedList =  new CustomLinkedList();
		customLinkedList.add(10);
		customLinkedList.add(20);
		customLinkedList.add(30);
		customLinkedList.add(40);
		customLinkedList.add(50);

		System.out.println("Custom Linked List: "+customLinkedList);
		customLinkedList.addBeforeHead(5);
		System.out.println("Insert before head: "+customLinkedList);
		customLinkedList.addAfterSpecificElement(7, 5);
		System.out.println("Insert after head: "+customLinkedList);
		customLinkedList.addAfterSpecificElement(35, 30);
		System.out.println("Insert middle: "+customLinkedList);
		customLinkedList.addAfterSpecificElement(60, 50);
		System.out.println("Insert last: "+customLinkedList);

		
	}

}
