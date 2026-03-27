package accessModifiers.vehicles;
import accessModifiers.tyre.CEAT;

public class Car extends CEAT {
    public static void main(String[] args) {
		System.out.println("This is Car class");
		System.out.println("x is: "+CEAT.x);
		CEAT.test();
		System.out.println("y is: "+CEAT.y);
		CEAT.demo();
	}
}
