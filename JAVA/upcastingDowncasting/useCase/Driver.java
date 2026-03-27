package upcastingDowncasting.useCase;

public class Driver {
	public static void main(String[] args) {
		String s1="abcde";
		Car c1=new Car();
		Bike b1=new Bike();
		Bus b=new Bus();
		Laptop l1=new Laptop();
		Shirt s=new Shirt();
		Dog d=new Dog();
		Service.process(s1);
		System.out.println("===========");
		Service.process(c1);
		System.out.println("===========");
		Service.process(b1);
		System.out.println("===========");
		Service.process(l1);
		System.out.println("===========");
		Service.process(s);
		System.out.println("===========");
		Service.process(d);
		System.out.println("===========");
		Service.process(b);
		System.out.println("=============");
		Service.fillFuel(c1);
		System.out.println("===========");
		Service.fillFuel(b1);
		System.out.println("===========");
		Service.fillFuel(b);
	
	}
	

}
