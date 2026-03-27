package inheritanceProgram.constructorOverloading;

public class Driver {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("BMW");
		Car car3 = new Car("Audi", 400);
		Car car4 = new Car("Mercedes", 500, 75000.50);

		System.out.println("Car 1: Name = " + car1.name + ", HP = " + car1.hp + ", Price = " + car1.price);
		System.out.println("Car 2: Name = " + car2.name + ", HP = " + car2.hp + ", Price = " + car2.price);
		System.out.println("Car 3: Name = " + car3.name + ", HP = " + car3.hp + ", Price = " + car3.price);
		System.out.println("Car 4: Name = " + car4.name + ", HP = " + car4.hp + ", Price = " + car4.price);
	}

}
