package hasARelationship.aggregation;

public class Driver {
    public static void main(String[] args) {
		Car c1 = new Car(new PetrolEngine(400));    // constructor injection
		Car c2 = new Car(new DieselEngine(600));    // constructor injection
		Engine eng=new PetrolEngine(350);
		Car c3 = new Car(eng);      // modified
		//Field Injection
		/*c1.e=new PetrolEngine(400);
		c2.e=new DieselEngine(600);
		Engine eng=new PetrolEngine(350);
		c3.e=eng;*/
		
		//Setter Injection
		/*c1.setEngine(new PetrolEngine(400));
        c2.setEngine(new DieselEngine(600));
        Engine eng=new ElectricEngine(350);
        c3.setEngine(eng);*/
		
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
