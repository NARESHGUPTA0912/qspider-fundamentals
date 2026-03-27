package inheritanceProgram.constructorOverloading;

public class Car {
	String name;
	int hp;
	double price;
	Car(){
		
	}
	Car(String name) {
		this.name = name;
	}

	Car(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	Car(String name, int hp, double price) {
		this.name = name;
		this.hp = hp;
		this.price = price;
	}

}
