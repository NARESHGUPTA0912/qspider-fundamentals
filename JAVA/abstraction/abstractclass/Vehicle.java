package abstraction.abstractclass;

public abstract class Vehicle {
	String name;
	double price;
	Vehicle(){
	}
	Vehicle(String name, double price){
		this.name=name;
		this.price=price;
	}
	public abstract void start();
	// public void stop() {
	// 	System.out.println("Stop Vehicle");
	// }
	public abstract void stop();
	public String getDetails() {
	return "Name: "+name+"\tPrice: "+price;
	}

}
