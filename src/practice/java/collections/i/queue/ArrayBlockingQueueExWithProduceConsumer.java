package practice.java.collections.i.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueExWithProduceConsumer {
	
	/*
	 * ArrayBlockingQueue is a bounded, thread-safe implementation of the BlockingQueue interface backed by an array.
	 * It is part of java.util.concurrent and is commonly used in producer-consumer problems.
	 * The queue has a fixed capacity, so once full, attempts to add more elements will block or fail based on the method used.
	 * Elements are ordered in FIFO (First-In-First-Out) manner.
	 *
	 * Common ArrayBlockingQueue Methods:
	 *  - add(item):         Inserts the specified element if space is available (throws exception if full)
	 *  - offer(item):       Inserts the specified element if possible (returns false if full)
	 *  - put(item):         Inserts the specified element, waiting if necessary for space to become available
	 *  - offer(item, timeout, unit): Inserts the specified element, waiting up to the specified time for space
	 *  - remove():          Retrieves and removes the head of the queue (throws exception if empty)
	 *  - poll():            Retrieves and removes the head of the queue (returns null if empty)
	 *  - poll(timeout, unit): Retrieves and removes the head, waiting up to the specified time if necessary
	 *  - take():            Retrieves and removes the head, waiting if necessary until an element becomes available
	 *  - peek():            Retrieves, but does not remove, the head of the queue (returns null if empty)
	 *  - isEmpty():         Checks if the queue is empty
	 *  - size():            Returns the number of elements in the queue
	 *
	 * Notes:
	 *  - The capacity of the queue is set at creation and cannot be changed.
	 *  - Null elements are not permitted.
	 *  - Operations are thread-safe and support blocking behavior for both insertion and removal.
	 *  - Useful for coordinating work between multiple producer and consumer threads.
	 *  - Fairness policy can be optionally set to true for first-come-first-served access order.
	 *
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example scenario: Similar to Uber, Rapido, or Ola – simulating booking requests and available drivers.
		//1. Create a new array blocking queue
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(5);
		
		// 2. Pass this queue to the producer and consumer threads.
		// The producer adds bookings (customers) and the consumer simulates drivers picking up customers.
		ProducerCustomer pc = new ProducerCustomer(bq);
		ConsumerDriver cd = new ConsumerDriver(bq);
		// 3. Start the threads. To observe thread waiting/blocking, run in debug mode.
		pc.start();
		cd.start();
		
		
	}

}
