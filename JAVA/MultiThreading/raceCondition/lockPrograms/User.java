package MultiThreading.raceCondition.lockPrograms;

public class User extends Thread{
	String name;
	int n;
	Counter c;
	
	User(){
		
	}
	User(String name, int n, Counter c){
		this.name=name;
		this.n=n;
		this.c=c;
	}
	@Override
	public void run() {
		System.out.println(name+" started");
		
		for(int i=1;i<=n;i++) {
			c.increment();
			
		}
		System.out.println(name+" thread final count is: "+c.getCount());
	}

}