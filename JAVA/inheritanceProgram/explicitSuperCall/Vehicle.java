package inheritanceProgram.explicitSuperCall;

public class Vehicle {
	String name;
	double price;
	Vehicle(){
		
	}

	Vehicle(String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	public String getDetails() {
		return "Name: "+name+"\tPrice: "+price;
	}

}
