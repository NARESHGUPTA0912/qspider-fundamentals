package polymorphism.shapeBasedProject;

public class Rectangle implements TwoDShape{
    private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		if (length <= 0 || breadth <= 0)
			throw new IllegalArgumentException("Length and breadth must be positive.");
		else {
			this.length = length;
			this.breadth = breadth;
		}
	}
	
	@Override
	public double getArea() {
		return length * breadth;
	}

	@Override
	public double getPerimeter() {
		return 2 * (length + breadth);
	}

	@Override
	public void rotate() {
		System.out.println("Rotating the rectangle.");
	}
}
