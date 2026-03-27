package MultiThreading.raceCondition.atomicInteger;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
	
		Counter c=new Counter();
		
		User u1=new User("Mohan", 1000, c);
		User u2=new User("Sohan", 800, c);
		User u3=new User("Rohan", 1200, c);
		
		u1.start();
		u2.start();
		u3.start();
		
		u1.join();
		u2.join();
		u3.join();
		
		System.out.println("Final count value is: "+c.getCount());
	}
}
