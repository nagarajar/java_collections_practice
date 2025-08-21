package practice.java.collections.i.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExWithProduceConsumer {
	
	/*
	 * PriorityBlockingQueue is a thread-safe, unbounded implementation of the BlockingQueue interface that uses
	 * the same ordering rules as PriorityQueue. Elements are ordered according to their natural ordering or by a
	 * Comparator provided at queue construction time. The queue does not block producer threads (queue is unbounded),
	 * but consumer threads will block if the queue is empty.
	 *
	 * Common PriorityBlockingQueue Methods:
	 *  - add(item):         Inserts the specified element into the queue
	 *  - offer(item):       Inserts the specified element into the queue
	 *  - put(item):         Inserts the specified element into the queue (never blocks, as the queue is unbounded)
	 *  - remove():          Retrieves and removes the head of the queue (throws exception if empty)
	 *  - poll():            Retrieves and removes the head of the queue (returns null if empty)
	 *  - poll(timeout, unit): Retrieves and removes the head, waiting up to the specified time if necessary
	 *  - take():            Retrieves and removes the head, waiting if necessary until an element becomes available
	 *  - peek():            Retrieves, but does not remove, the head of the queue (returns null if empty)
	 *  - isEmpty():         Checks if the queue is empty
	 *  - size():            Returns the number of elements in the queue
	 *
	 * Notes:
	 *  - Null elements are not permitted.
	 *  - All elements must be mutually comparable (implement Comparable or use a Comparator).
	 *  - The queue is unbounded; producer operations never block due to capacity.
	 *  - Useful for priority-based scheduling in concurrent applications.
	 *  - Elements with the highest priority are retrieved first (natural order: smallest first).
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example scenario: Similar to Uber, Rapido, or Ola – simulating booking requests and available drivers.
		//1. Create a new priority blocking queue
		BlockingQueue<Integer> bq = new PriorityBlockingQueue<>();
		
		// 2. Pass this queue to the producer and consumer threads.
		// The producer adds bookings (customers) and the consumer simulates drivers picking up customers.
		ProducerCustomer pc = new ProducerCustomer(bq);
		ConsumerDriver cd = new ConsumerDriver(bq);
		// 3. Start the threads. To observe thread waiting/blocking, run in debug mode.
		pc.start();
		cd.start();
		
		
	}

}
