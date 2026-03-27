package methodChaining;

public class Bike implements Vehicle{
    @Override
	public Vehicle start() {
		System.out.println("Bike started");
		return this;
	}

	@Override
	public Vehicle stop() {
		System.out.println("Bike stopped");
		return this;
	}

	@Override
	public Vehicle drive() {
		System.out.println("Bike is driving");
		return this;
	}
}
