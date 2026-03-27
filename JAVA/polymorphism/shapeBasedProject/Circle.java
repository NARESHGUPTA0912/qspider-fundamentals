package polymorphism.shapeBasedProject;

public class Circle implements TwoDShape {
    private double radius;
	
	public Circle(double radius) {
		if (radius <= 0)
			throw new IllegalArgumentException("Radius must be positive.");
		else
			this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public void rotate() {
		System.out.println("Rotating the circle.");
	}
}
