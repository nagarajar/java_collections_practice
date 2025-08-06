package practice.java.collections.e.synchronization;

import java.util.List;
import java.util.Vector;

public class CheckVectorIsSynchonized {
	public static void main(String[] args) {
		// 1. Create the Vector
		List<Integer> list = new Vector<Integer>();
		// 2. Pass this list to the Thread1 and Thread2 then in the run method try to add one element
		Thread1 t1 = new Thread1(list);
		t1.start();
		
		Thread2 t2 = new Thread2(list);
		t2.start();
		
		System.out.println("Vector : "+list);
		//Conclusion is vector is thread safe means its synchronized - If one thread is add the element other thread has to wait.
		//a. we can predict order of insertion the list
	}
}
