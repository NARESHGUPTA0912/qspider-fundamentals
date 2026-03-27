package MultiThreading.producerConsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{
	
	String name;
	BlockingQueue<Integer> q;
	public Consumer(String name, BlockingQueue<Integer> q) {
		this.name=name;
		this.q=q;
	}
        @Override
	public void run() {
		for(int i=1;i<=5;i++) {
			
			try {
				if(q.isEmpty())
					Thread.sleep(2000);
				System.out.println("Consumer "+name+" has consumed Item: "+i);
				q.take();
				
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
