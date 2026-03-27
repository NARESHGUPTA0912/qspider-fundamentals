package ploymorphism.methodOverriding;

public class Triangle extends TwoDShape{
	
	
	
	@Override
	public void area() {
		System.out.println("Area of Triangle is 0.5*b*h");
	}


}
