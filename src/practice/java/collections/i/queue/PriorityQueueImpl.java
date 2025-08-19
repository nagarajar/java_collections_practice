package practice.java.collections.i.queue;

import java.util.PriorityQueue;

public class PriorityQueueImpl {
	/*
	 * A PriorityQueue is a special type of Queue in Java where each element is associated with a priority,
	 * and elements are ordered according to their natural ordering or by a Comparator provided at queue construction time.
	 * The element with the highest priority is served before other elements.
	 * Unlike standard queues (FIFO), a PriorityQueue does not guarantee FIFO order for elements with the same priority.
	 * In Java, PriorityQueue is a class in java.util that implements the Queue interface.
	 *
	 * Common PriorityQueue Methods:
	 *  - add(item):       Inserts the specified element into the priority queue (throws an exception if capacity is exceeded)
	 *  - offer(item):     Inserts the specified element into the priority queue (returns false if capacity is exceeded)
	 *  - remove():        Retrieves and removes the head of the queue (throws an exception if the queue is empty)
	 *  - poll():          Retrieves and removes the head of the queue (returns null if the queue is empty)
	 *  - element():       Retrieves, but does not remove, the head of the queue (throws an exception if the queue is empty)
	 *  - peek():          Retrieves, but does not remove, the head of the queue (returns null if the queue is empty)
	 *  - isEmpty():       Checks if the priority queue is empty
	 *  - size():          Returns the number of elements in the priority queue
	 *
	 * Notes:
	 *  - By default, PriorityQueue in Java is a min-heap: the smallest element is always at the head.
	 *  - Null elements are not permitted.
	 *  - PriorityQueue is not thread-safe; use PriorityBlockingQueue for concurrent access.
	 *  - Elements must be mutually comparable (must implement Comparable or provide a Comparator).
	 *
	 */
	
	public static void main(String[] args) {
		//How PriorityQueue is different from regular Queue
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(0);
		pq.add(15);
		pq.add(25);
		pq.add(5);
		
		System.out.println("pq: "+pq); //Expected [10, 0, 15, 25, 5]
		// But o/p: pq: [0, 5, 15, 25, 10] //its not order wise printing
		
		//Lets check by remove elements
		System.out.println(pq.poll()); //Expected: 0 But 0
		System.out.println(pq.poll()); //Expected: 5 But 5
		System.out.println(pq.poll()); //Expected: 15 But 10
		System.out.println(pq.poll()); //Expected: 25 But 15
		System.out.println(pq.poll()); //Expected: 10 But 25
		//So Priority queue follows the nature order but not printing as nature order so we should n't depends on print
		
		// Now try with Employee object
		PriorityQueue<Employee> pqe = new PriorityQueue<>();
		pqe.add(new Employee(128, "K"));
		pqe.add(new Employee(121, "L"));
		pqe.add(new Employee(126, "M"));
		pqe.add(new Employee(122, "O"));
		pqe.add(new Employee(125, "K"));
		
		System.out.println("pqe: "+pqe); //Expected: Employee: [id=121, name=L] ..... etc But
		//Exception in thread "main" java.lang.ClassCastException: class practice.java.collections.i.queue.Employee cannot be cast to class java.lang.Comparable (practice.java.collections.i.queue.Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
		//Note: So, priority queue always look for the comparable or comparator impl to sort in natural or custom order.
		//1. Implement comparable in employee class
		// implements Comparable<Employee>
		// @Override
		// public int compareTo(Employee o){
		//		Integer.compare(this.id, o.id);
		// }
		//
		//2. send Comparator in the PriorityQueue constructor
		// PriorityQueue<Employee> pqe = new PriorityQueue<>(new Comparator<Employee>() {
		// 		@Override
		// 		public int compare(Employee o1, Employee o2){
		//			return Integer.compare(o1.getId(), o2.getId());
		// 		}
		// }
		//);
		
		//We can implement Priority queue using AL or LL by sending Comparator in the constructor.
		
		
	}
	
}
