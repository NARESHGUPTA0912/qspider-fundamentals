package abstraction.interfacePrograms;

import java.util.Scanner;

public class Game {
    
    public static TwoDShape startGame() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1==> For Circle");
		System.out.println("Press 2==> For Square");
		System.out.println("Press 3==> For Rectangle");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Circle");
			System.out.println("Enter radius of circle:");
			double radius=sc.nextDouble();
			Circle c=new Circle(radius);
		return c;
		}
		else if(choice==2) {
			System.out.println("Enter side of square:");
			double side=sc.nextDouble();
			Square s=new Square(side);
		return s;
		}
		else if(choice==3) {
			System.out.println("Enter length of rectangle:");
			double length=sc.nextDouble();
			System.out.println("Enter width of rectangle:");
			double width=sc.nextDouble();
			Rectangle r=new Rectangle(length, width);
		return r;
		}
		else {
			System.out.println("Invalid choice!");
			return startGame();
		}
	}
}
