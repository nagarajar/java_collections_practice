package practice.java.collections.i.queue;

public class UseCustomLinkedList {
	
	public static void main(String[] args) {
		// Assignment: Write a program to add multiple elements to liked list without iterating throughout the LL
		LinkedListImpWithoutUsingWhileLoop ll = new LinkedListImpWithoutUsingWhileLoop();
		ll.add(10);
		ll.add(50);
		ll.add(20);
		ll.add(60);
		ll.add(70);
		System.out.println(ll);
		System.out.println(ll.getFirstElement());
		System.out.println(ll.getLastElement());
	}

}
