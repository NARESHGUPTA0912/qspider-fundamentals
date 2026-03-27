package abstraction.abstractclass;

public class ElectricCar extends Car{
	int volt;
	
	ElectricCar(String name, double price, int hp, int volt){
		super(name, price, hp);
		this.volt=volt;
	}
	
	@Override
	public void start() {
		System.out.println("Start ElectricCar");
	}
	@Override
	public void stop() {
		System.out.println("Stop ElectricCar");
	}
	@Override
	public void openGate() {
		System.out.println("Open gate in electric Car");
	}
	
	public void charge() {
		System.out.println("charge electric Car");
	}
	public String getDetails() {
	return super.getDetails()+"\tVolt capacity is: "+volt;
	}
}
