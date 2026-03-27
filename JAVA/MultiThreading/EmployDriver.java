package MultiThreading;

public class EmployDriver {
    public static void main(String[] args) throws InterruptedException  {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Employ e1=new Employ("Alice", 101, 464557.7);
		Employ e2=new Employ("Mohan", 102, 404557.7);
		Employ e3=new Employ("Charlie", 103, 664557.7);
		Employ e4=new Employ("Diana", 104, 469557.7);
		
		Thread t1=new Thread(e1);
		Thread t2=new Thread(e2);
		Thread t3=new Thread(e3);
		Thread t4=new Thread(e4);
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		System.out.println(t4.getName());
		
		t2.setDaemon(true);
		t3.setPriority(8);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		t1.join();
		
		System.out.println("Main==========================Ends");
		
	}   
}
