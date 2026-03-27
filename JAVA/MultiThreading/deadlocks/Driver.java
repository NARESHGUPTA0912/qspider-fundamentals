package MultiThreading.deadlocks;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
		String p="Bat";
		String q="Ball";
		User u1=new User("Mohan", p, q);
		User u2=new User("Sohan", p, q);
		u1.start();
		u2.start();
		u1.join();
		u2.join();
		System.out.println("=====Application Ends====");
	}
}
