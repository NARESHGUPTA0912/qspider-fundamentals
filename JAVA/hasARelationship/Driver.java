package hasARelationship;

public class Driver {
    public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		System.out.println("Car 1 obj refe: "+c1);
		System.out.println("Car1 Engine obj refe: "+c1.e);
		System.out.println("Car1 engine HP is: "+c1.e.hp);
		System.out.println("============================");
		System.out.println("Car 2 obj refe: "+c2);
		System.out.println("Car2 Engine obj refe: "+c2.e);
		System.out.println("Car2 engine HP is: "+c2.e.hp);
		System.out.println("============================");
		System.out.println("Car 1 obj refe: "+c3);
		System.out.println("Car1 Engine obj refe: "+c3.e);
		System.out.println("Car1 engine HP is: "+c3.e.hp);
	}

}
