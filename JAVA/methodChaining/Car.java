package methodChaining;

public class Car {
    public Car start() {
		System.out.println("Start method");
	return this;
	}
	
	public void drive() {
		System.out.println("drive method");
	}
}
