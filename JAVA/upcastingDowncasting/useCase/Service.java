package upcastingDowncasting.useCase;

public class Service {
	
	public static void process(Object o) {
		if(o instanceof String) {
			System.out.println(o);
			String s=(String)o;
			System.out.println(s.length()); // compile time error);
		}else if(o instanceof Car) {
            Car c=(Car)o;
            c.test();
            c.drive();
		}else if(o instanceof Bike) {
			Bike b=(Bike)o;
			b.test();
			b.drive();
		}else if(o instanceof Laptop  l) {
			l.test();
			l.use();
		}else if(o instanceof Shirt s) {
			s.test();
			s.wash();
		}else if(o instanceof Dog d) {
			d.bark();
			d.test();
		}else {
			System.out.println("Other type of Object");
		}
			
		
	}
	public static void fillFuel(Vehicle v) {
		if(v instanceof Car c)
			c.drive();
		else if(v instanceof Bike b)
			b.drive();
		else if(v instanceof Bus b)
			b.drive();
	}

}
