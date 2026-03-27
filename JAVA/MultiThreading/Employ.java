package MultiThreading;

public class Employ extends Human implements Runnable{

	int id;
	double salary;
	
	Employ(){
		
	}
	Employ(String name, int id, double salary){
		super(name);
		this.id=id;
		this.salary=salary;
	}
    @Override
	public void run() {
		try {
			work();
		} catch (InterruptedException e) {
			System.out.println(name+"\t Interuuption occureed "+Thread.currentThread().getName());
			e.printStackTrace();
		}
	}
	
	public void work() throws InterruptedException {
		System.out.println("==========="+name+" started working with id: "+id+" and salary: "+salary+"=========");
		System.out.println("Object name: "+name+" Thread name is: "+Thread.currentThread().getName());
		
		for(int i=1;i<=9;i++) {
			System.out.println(name+" is working for "+i+" hours");
			if(name.equalsIgnoreCase("Mohan"))
			Thread.sleep(500);
			
		}
		System.out.println("============"+name+" finished working======================");
	}
	
	public void test() {
		System.out.println("test method");
	}
}