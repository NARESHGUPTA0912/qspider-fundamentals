package polymorphism.shapeBasedProject;

public class Square implements TwoDShape{
    private double side;
	
	public Square(double side) {
		if (side <= 0)
			throw new IllegalArgumentException("Side must be positive.");
		else
			this.side = side;
	}
	
	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

	@Override
	public void rotate() {
		System.out.println("Rotating the square.");
	}
}
