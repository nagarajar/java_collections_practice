package practice.java.collections.e.synchronization;

import java.util.List;

public class Thread1 extends Thread {
	List<Integer> l = null;
	public Thread1(List<Integer> l) {
		this.l = l;
	}
	
	public Thread1() {
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run method Thread1");
		if(l!=null) {
			l.add(10);
//			System.out.println(l);
		}
	}
}
