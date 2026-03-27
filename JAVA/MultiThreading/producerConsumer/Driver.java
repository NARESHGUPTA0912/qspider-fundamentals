package MultiThreading.producerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Driver {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> b=new ArrayBlockingQueue<>(2);
		Producer p=new Producer("Mohan", b);
		Consumer c=new Consumer("Sohan", b);
		
		p.start();
		c.start();
		
		p.join();
		c.join();
		
		System.out.println("=====Function Over=======");
	}

}

