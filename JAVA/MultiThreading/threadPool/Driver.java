package MultiThreading.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {
    public static void main(String[] args) {
		Task t1=new Task("Read");
		Task t2=new Task("Cleaning");
		Task t3=new Task("Collect Money");
		Task t4=new Task("Write");
		Task t5=new Task("watch");
		Task t6=new Task("Cleaning");
		Task t7=new Task("Managing Accounts");
		Task t8=new Task("Customer Support");
		Task t9=new Task("Inventory Management");
		Task t10=new Task("Marketing");
		Task t11=new Task("Cook");
		
		
		//Thread.startVirtualThread(t1);
		
		/*t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();*/
		
		ExecutorService service=Executors.newFixedThreadPool(5);
		service.submit(t1);
		service.submit(t2);
		service.submit(t3);
		service.submit(t4);
		service.submit(t5);
		service.submit(t6);
		service.submit(t7);
		service.submit(t8);
		service.submit(t9);
		service.submit(t10);
		service.submit(t11);
		
		service.shutdown();
	}
}
