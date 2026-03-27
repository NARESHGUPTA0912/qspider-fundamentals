package abstraction.abstractclass;

public abstract class Car extends Vehicle{
	int hp;
	Car(){
	}
	Car(String name, double price, int hp){
		super(name, price);
		this.hp=hp;
	}
	public abstract void openGate();
	@Override
	public String getDetails() {
		return super.getDetails()+"\tHP: "+hp;
	}
}
