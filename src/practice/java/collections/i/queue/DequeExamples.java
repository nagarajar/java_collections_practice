package practice.java.collections.i.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Deque (Double Ended Queue) is a linear data structure that allows the insertion and removal 
		 * of elements from both ends (head and tail). It can function as both a queue (FIFO) and a stack (LIFO).
		 * Deque is an interface in java.util and is implemented by classes such as ArrayDeque and LinkedList.
		 *
		 * Common Deque Methods:
		 *  - addFirst(item):    Inserts the specified element at the front of the deque
		 *  - addLast(item):     Inserts the specified element at the end of the deque
		 *  - offerFirst(item):  Inserts the specified element at the front (returns false if capacity is exceeded)
		 *  - offerLast(item):   Inserts the specified element at the end (returns false if capacity is exceeded)
		 *  - removeFirst():     Retrieves and removes the first element (throws exception if empty)
		 *  - removeLast():      Retrieves and removes the last element (throws exception if empty)
		 *  - pollFirst():       Retrieves and removes the first element (returns null if empty)
		 *  - pollLast():        Retrieves and removes the last element (returns null if empty)
		 *  - getFirst():        Retrieves, but does not remove, the first element (throws exception if empty)
		 *  - getLast():         Retrieves, but does not remove, the last element (throws exception if empty)
		 *  - peekFirst():       Retrieves, but does not remove, the first element (returns null if empty)
		 *  - peekLast():        Retrieves, but does not remove, the last element (returns null if empty)
		 *  - isEmpty():         Checks if the deque is empty
		 *  - size():            Returns the number of elements in the deque
		 *
		 * Notes:
		 *  - Deque can be used as a stack by using only the methods at one end (e.g., addFirst, removeFirst).
		 *  - Null elements are generally not permitted in most Deque implementations.
		 *  - ArrayDeque is usually preferred over Stack for stack operations.
		 *  - Deque implementations are not thread-safe; use ConcurrentLinkedDeque for concurrent access.
		 *
		 */
		
		//1. Will use the ArrayDequeue as example
		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(10);
		dq.add(50);
		dq.add(20);
		dq.add(60);
		dq.add(5);
		System.out.println(dq);
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq);
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq);
		dq.addFirst(15);
		dq.addLast(25);
		System.out.println(dq);
		
		

	}

}
