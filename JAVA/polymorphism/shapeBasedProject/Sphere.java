package polymorphism.shapeBasedProject;

public class Sphere implements ThreeDShape{
    private double radius;
	
	public Sphere(double radius) {
		if (radius <= 0)
			throw new IllegalArgumentException("Radius must be positive.");
		else
			this.radius = radius;
	}
	
	@Override
	public double getVolume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}

	@Override
	public double getLSA() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getTSA() {
		return getLSA();
	}

	@Override
	public void rotate() {
		System.out.println("Rotating the sphere.");
	}
}
