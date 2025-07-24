package practice.java.collections.synchronization;

import java.util.ArrayList;
import java.util.List;

public class CheckArrayListIsNotSynchonized {
	public static void main(String[] args) {
		// 1. Create the ArrayList
		List<Integer> list = new ArrayList<Integer>();
		// 2. Pass this list to the Thread1 and Thread2 then in the run method try to add one element
		Thread1 t1 = new Thread1(list);
		t1.start();
		
		Thread2 t2 = new Thread2(list);
		t2.start();
		
		System.out.println("ArrayList : "+list);
		//Conclusion is thread are not following the order of execution
		//Also ArrayList is not synchronized do to which multiple threads are able to access at time due to which
		//a. we can't predict order of insertion the list
		//b. we don't know which tread will execute first
		//c. if both threads are trying to add element to the same list some time will get ConcurrentModificationException
	}
}
