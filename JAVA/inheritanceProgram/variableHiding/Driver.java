package inheritanceProgram.variableHiding;

public class Driver {
	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println("Value of x using Car reference: "+c1.x); //30
		System.out.println("Value of x from Vehicle: "+((Vehicle)c1).x); //20
		System.out.println("Value of x from Transport: "+((Transport)c1).x);
		System.out.println("=====================");
		c1.display();
	}
}
