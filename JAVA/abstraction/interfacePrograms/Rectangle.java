package abstraction.interfacePrograms;

public class Rectangle implements TwoDShape {
    
    private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		return 2 * (length + width);
	}

	@Override
	public void rotate() {
		System.out.println("Rotating the rectangle");
	}

}
