package inheritanceProgram.explicitSuperCall;

public class Car extends Vehicle {
	int hp;
	int strokes;
	Car() {

	}

	Car(String name, double price, int hp, int strokes) {
		super(name, price);
		this.hp = hp;
		this.strokes = strokes;
	}

	public String getDetails() {
	return super.getDetails()+"\tHorsepower: " + hp + "\tStrokes: " + strokes;
	}

}
