package polymorphism.shapeBasedProject;
import java.util.Scanner;

public class Game {
    static Scanner sc=new Scanner(System.in);
	public static void start() {
		System.out.println("Game Started!");
		System.out.println("Press 1==>2D Shape");
		System.out.println("Press 2==>3D Shape");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			TwoDShape t1=selectAndGetTwoDShape();
			System.out.println("Area: " + t1.getArea());
			System.out.println("Perimeter: " + t1.getPerimeter());
			break;
		case 2:
			ThreeDShape t2=selectAndGetThreeDShape();
			System.out.println("Lateral Surface Area: " + t2.getLSA());
			System.out.println("Volume: " + t2.getVolume());
			System.out.println("Total Surface Area: " + t2.getTSA());
			break;
		default:
			System.out.println("Invalid Choice");
			System.out.println("Press 1 to continue or 0 to exit");
			int ch=sc.nextInt();
			if (ch == 1)
				start();
			else {
				System.out.println("Game Over!");
				System.exit(0);
			}
		}
	}
	private static TwoDShape selectAndGetTwoDShape() {
		System.out.println("Press 1==> Circle");
		System.out.println("Press 2==> Rectangle");
		System.out.println("Press 3==> Square");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("You selected Circle");
			System.out.println("Enter radius:");
			double radius = sc.nextDouble();
			Circle circle = new Circle(radius);
			return circle;
			case 2:
				System.out.println("You selected Rectangle");
				System.out.println("Enter length:");
				double length = sc.nextDouble();
				System.out.println("Enter breadth:");
				double breadth = sc.nextDouble();
				Rectangle rectangle = new Rectangle(length, breadth);
			return rectangle;
			case 3:
				System.out.println("You selected Square");
				System.out.println("Enter side:");
				double side = sc.nextDouble();
				Square square = new Square(side);
			return square;
		default:
			System.out.println("Invalid Choice");
			System.out.println("Press 1 to continue or 0 to exit");
			int ch = sc.nextInt();
			if (ch == 1)
				return selectAndGetTwoDShape();
			
			else {
				System.out.println("Game Over!");
				System.exit(0);
				return null;
			}
		}
	}
	public static ThreeDShape selectAndGetThreeDShape() {
		System.out.println("Press 1==> Cylinder");
		System.out.println("Press 2==> Sphere");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("You selected Cylinder");
			System.out.println("Enter radius:");
			double radius = sc.nextDouble();
			System.out.println("Enter height:");
			double height = sc.nextDouble();
			Cylinder cylinder = new Cylinder(radius, height);
			return cylinder;
			
		case 2:
			System.out.println("You selected Sphere");
			System.out.println("Enter radius:");
			double r = sc.nextDouble();
			Sphere sphere = new Sphere(r);
			return sphere;
		
		default:
			System.out.println("Invalid Choice");
			return selectAndGetThreeDShape();
		}
	}
	public static boolean playAgain() {
		System.out.println("Do you want to play again? (yes/no)");
		String response = sc.next();
		return response.equalsIgnoreCase("yes");
	}
}
