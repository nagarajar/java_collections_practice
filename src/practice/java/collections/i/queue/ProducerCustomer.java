package practice.java.collections.i.queue;

import java.util.concurrent.BlockingQueue;

public class ProducerCustomer extends Thread {
	
	BlockingQueue<Integer> bq=null;
	
	ProducerCustomer(BlockingQueue<Integer> bq){
		this.bq=bq;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			try {
				//put(item):         Inserts the specified element, waiting if necessary for space to become available
				bq.put(i);
				System.out.println(i +" is added to queue");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
