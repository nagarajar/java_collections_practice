package practice.java.collections.i.queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseCustomQuaue {

	public static void main(String[] args) {
		/*
		 * A Queue is a linear data structure that follows the First In, First Out (FIFO) principle.
		 * The first element added to the queue is the first one to be removed.
		 * In Java, Queue is an interface present in java.util and is commonly implemented by classes like LinkedList, PriorityQueue, and ArrayDeque.
		 * The LinkedList class implements the Queue interface, so it can be used as a Queue in Java.
		 * 
		 * Common Queue Methods:
		 *  - add(item):       Inserts the specified element into the queue (throws an exception if capacity is exceeded)
		 *  - offer(item):     Inserts the specified element into the queue (returns false if capacity is exceeded)
		 *  - remove():        Retrieves and removes the head (front) of the queue (throws an exception if the queue is empty)
		 *  - poll():          Retrieves and removes the head (front) of the queue (returns null if the queue is empty)
		 *  - element():       Retrieves, but does not remove, the head of the queue (throws an exception if the queue is empty)
		 *  - peek():          Retrieves, but does not remove, the head of the queue (returns null if the queue is empty)
		 *  - isEmpty():       Checks if the queue is empty
		 *  - size():          Returns the number of elements in the queue
		 * 
		 */
		
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		
		System.out.println("Queue: "+q);//[10,20,30,40,50,60]
		System.out.println("Queue peek: "+q.peek()); //10
		System.out.println("Queue: "+q);//[10,20,30,40,50,60]
		System.out.println("Queue poll: "+q.poll());//10
		System.out.println("Queue: "+q);//[20,30,40,50,60]
		System.out.println("Queue peek: "+q.peek()); //20
		System.out.println("Queue: "+q);//[20,30,40,50,60]
		System.out.println("Queue poll: "+q.poll());//20
		System.out.println("Queue: "+q);//[30,40,50,60]
		System.out.println("Queue poll: "+q.poll());//30
		System.out.println("Queue: "+q);//[40,50,60]
		System.out.println("Queue poll: "+q.poll());//40
		System.out.println("Queue: "+q);//[50,60]
		System.out.println("Queue poll: "+q.poll());//50
		System.out.println("Queue poll: "+q.poll());//60
		System.out.println("Queue: "+q);//[]
		System.out.println("Queue poll: "+q.poll());//null //Because Queue is empty
		System.out.println("Queue peek: "+q.peek());//null //Because Queue is empty

		

	}

}
