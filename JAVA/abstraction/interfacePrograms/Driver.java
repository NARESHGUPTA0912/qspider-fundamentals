package abstraction.interfacePrograms;

public class Driver {
    public static void main(String[] args) {
		TwoDShape t	=Game.startGame();// new Square(5); new Circle(7); new rectangle(4,6);
		t.rotate();
		System.out.println("Area is: "+t.getArea());
		System.out.println("Perimeter is: "+t.getPerimeter());
	}
}
