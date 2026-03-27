package MultiThreading;

public class UserDriver {
    public static void main(String[] args) throws InterruptedException {
		User u1=new User("Mohan", 10);
		User u2=new User("Sohan", 20);
		User u3=new User("Rohan", 30);
		User u4=new User("John", 5);
	
		System.out.println(Thread.currentThread().getName());
	
		u1.start();
		u2.start();
		u3.start();
		u4.start();
		
	}
}
