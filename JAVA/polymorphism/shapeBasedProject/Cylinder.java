package polymorphism.shapeBasedProject;

public class Cylinder implements ThreeDShape{
    private double radius;
	private double height;
	private static final double PI = Math.PI;
	
	public Cylinder(double radius, double height) {
		if (radius <= 0 || height <= 0)
			throw new IllegalArgumentException("Radius and height must be positive.");
		else {
			this.radius = radius;
			this.height = height;
		}
	}
	
	@Override
	public double getVolume() {
		return PI * radius * radius * height;
	}

	@Override
	public double getLSA() {
		return 2 * PI * radius * height;
	}

	@Override
	public double getTSA() {
		return 2 * PI * radius * (radius + height);
	}

	@Override
	public void rotate() {
		System.out.println("Rotating the cylinder.");
	}
}
