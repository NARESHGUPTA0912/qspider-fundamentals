package ploymorphism.methodOverriding;

public class Driver {
	public static void main(String[] args) {
		Circle c1=new Circle();
		Rectangle r1=new Rectangle();
		Triangle t1=new Triangle();
		Square s1=new Square();
		
		Service.process(c1);
		Service.process(r1);
		Service.process(t1);
		Service.process(s1);
	}

}
