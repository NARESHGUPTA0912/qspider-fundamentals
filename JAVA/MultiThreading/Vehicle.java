package MultiThreading;

public class Vehicle extends Thread{
	String name;
	int distance;
	Vehicle(String name, int distance){
		this.name = name;
		this.distance = distance;
	}
	
    @Override
	public void run() {
		move();
	}

	
	public void move() {
		System.out.println("========="+name+" started moving.==========");
		for(int i=1;i<=distance;i++) {
			System.out.println(name+" has travelled "+i+" km.");
		}
		System.out.println("=========="+name+" has reached the destination.================");
	}

}
