package MultiThreading;

public class User extends Thread{
    String name;
	int duration;
	
	User(String name, int duration){
		this.name=name;
		this.duration=duration;
	}
	@Override
	public void run() {
		try {
			watch();
		} catch (InterruptedException e) {
			System.out.println("dont disturb me!");
		}
	}
	
	
	public void watch() throws InterruptedException {
		System.out.println("====="+name+" strated watching=====");
		System.out.println(name+" thread name is: "+Thread.currentThread().getName());
		if(name.equalsIgnoreCase("Mohan"))
			Thread.sleep(10000);
		for(int i=1;i<=duration;i++) {
			System.out.println(name+" is watching for "+i+" mins");
			
				
		}
		System.out.println("====="+name+" finished watching=====");
	}
}
