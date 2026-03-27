package MultiThreading.deadlocks;

public class User extends Thread{
	String name;
	String resourse1;
	String resourse2;
	User(String name, String resource1, String resource2){
		this.name=name;
		this.resourse1=resource1;
		this.resourse2=resource2;
	}
	
        @Override
	public  void run() {
		
		synchronized(resourse1) {
			System.out.println(name+" started=======");
			System.out.println(name+" is using: "+resourse1);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			synchronized (resourse2) {
				System.out.println(name+" is Now using: "+resourse2);
			}
			System.out.println("======"+name+" has released the Lock=====");
		}
		
	}


}