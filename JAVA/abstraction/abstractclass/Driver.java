package abstraction.abstractclass;

public class Driver {
	public static void main(String[] args) {
		Vehicle v1=new ElectricCar("TATA", 325356.5, 240, 300);
		
		v1.start();
		v1.stop();
		Car c1=(Car)v1;
		c1.openGate();
		ElectricCar e1=(ElectricCar)c1;
		e1.charge();
		System.out.println("============================");
		System.out.println(v1.getDetails());
		System.out.println(c1.getDetails());
		System.out.println(e1.getDetails());
	}
}
