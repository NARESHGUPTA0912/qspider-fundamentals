package inheritanceProgram.explicitSuperCall;

public class Driver {
	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car("TATA", 354367.5, 120, 8);
		Car c4=new Car("Maruti", 454367.5, 160, 6);
		
		System.out.println(c1.getDetails());
		System.out.println(c2.getDetails());
		System.out.println(c3.getDetails());
		System.out.println(c4.getDetails());
	}

}
