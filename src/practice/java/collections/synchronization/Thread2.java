package practice.java.collections.synchronization;

import java.util.List;

public class Thread2 extends Thread {
	List<Integer> l = null;
	public Thread2(List<Integer> l) {
		this.l = l;
	}
	
	public Thread2() {
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run method Thread2");
		if(l!=null) {
			l.add(20);
//			System.out.println(l);
		}
	}
}
