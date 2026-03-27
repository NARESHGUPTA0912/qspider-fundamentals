package ploymorphism.methodOverriding;

public class Circle extends TwoDShape{
	
	
	@Override
	public void area() {
		System.out.println("Area of Circle is PI*r*r");
	}

}
