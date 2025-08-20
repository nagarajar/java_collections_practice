package practice.java.collections.i.queue;

import java.util.concurrent.BlockingQueue;

public class ConsumerDriver extends Thread {
	
	BlockingQueue<Integer> bq=null;
	
	ConsumerDriver(BlockingQueue<Integer> bq){
		this.bq=bq;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			try {
				//take():            Retrieves and removes the head, waiting if necessary until an element becomes available
				int val = bq.take();
				System.out.println(val +" is taken from queue");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
