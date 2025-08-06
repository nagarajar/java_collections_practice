package practice.java.collections.e.synchronization;

public class MainClassForThreadsExec {
	public static void main(String[] args) {
		//Synchronization: When multiple threads are trying to perform operation on the same object, but if one thread 
		//is performing some operation other threads has to wait till the current thread completes its execution.
		//0. Thread - Thread is a independent path of execution
		//1. Create the two thread class by implementing Runnable or extending Thread class
		//2. Now create the object of those threads and then start the thread also run in debug mode observe the threads creation.
		Thread1 thread1 = new Thread1();
		thread1.start();
		
		Thread2 thread2 = new Thread2();
		thread2.start();
	}
}
