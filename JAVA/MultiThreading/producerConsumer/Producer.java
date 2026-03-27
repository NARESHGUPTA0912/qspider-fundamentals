package MultiThreading.producerConsumer;
import java.util.concurrent.BlockingQueue;
public class Producer extends Thread{
	
	String name;
	BlockingQueue<Integer> q;
	Producer(String name, BlockingQueue<Integer> q) {
		this.name=name;
		this.q=q;
	}
        @Override
	public void run() {
		for(int i=1;i<=5;i++) {
			
			try {
				System.out.println("Producer "+name+" has created Item: "+i);
				q.put(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	

}