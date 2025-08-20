package practice.java.collections.i.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A BlockingQueue is a type of Queue in Java that supports operations that wait for the queue
		 * to become non-empty when retrieving an element and wait for space to become available when storing an element.
		 * It is typically used in producer-consumer scenarios where threads safely communicate by passing objects via the queue.
		 * BlockingQueue is an interface in java.util.concurrent and is implemented by classes like LinkedBlockingQueue,
		 * ArrayBlockingQueue, PriorityBlockingQueue, and DelayQueue.
		 *
		 * Common BlockingQueue Methods:
		 *  - add(item):         Inserts the specified element into the queue (throws an exception if capacity is exceeded)
		 *  - offer(item):       Inserts the specified element into the queue (returns false if capacity is exceeded)
		 *  - put(item):         Inserts the specified element, waiting if necessary for space to become available
		 *  - offer(item, timeout, unit): Inserts the specified element, waiting up to the specified time for space
		 *  - remove():          Retrieves and removes the head of the queue (throws an exception if the queue is empty)
		 *  - poll():            Retrieves and removes the head of the queue (returns null if the queue is empty)
		 *  - poll(timeout, unit): Retrieves and removes the head, waiting up to the specified time if necessary
		 *  - take():            Retrieves and removes the head, waiting if necessary until an element becomes available
		 *  - peek():            Retrieves, but does not remove, the head of the queue (returns null if the queue is empty)
		 *  - isEmpty():         Checks if the queue is empty
		 *  - size():            Returns the number of elements in the queue
		 *
		 * Notes:
		 *  - BlockingQueue does not permit null elements.
		 *  - Some implementations are bounded (fixed size) (e.g., ArrayBlockingQueue), others are unbounded (e.g., LinkedBlockingQueue).
		 *  - Useful for thread-safe producer-consumer designs.
		 *  - The methods put() and take() will block the calling thread until they can proceed.
		 *  - Does not support element removal via arbitrary positions (no remove(Object) or iterator.remove()) in some implementations.
		 *
		 */
		
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(5);
		bq.add(10);
		bq.add(20);
		bq.add(50);
		bq.add(40);
		bq.add(30);
		System.out.println(bq);
		bq.add(60);//Exception in thread "main" java.lang.IllegalStateException: Queue full
	}

}
