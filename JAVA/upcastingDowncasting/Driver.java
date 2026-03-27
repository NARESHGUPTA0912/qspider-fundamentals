package upcastingDowncasting;

public class Driver {
	public static void main(String[] args) {
		// Upcasting
		Vehicle v1=new Car();
		System.out.println(v1.x);
		//downcasting
		Car c1=(Car)v1;
		System.out.println(c1.x);
		System.out.println(c1.p);
		System.out.println(v1);
		System.out.println(c1);
		System.out.println(v1 instanceof Car);
		System.out.println(v1 instanceof Bus);
	}
}
