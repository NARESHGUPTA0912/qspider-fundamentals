package polymorphism.shapeBasedProject;

public class User {
    public static void main(String[] args) {
		do {
			Game.start();
		}while(Game.playAgain());
		System.out.println("Thank you for playing!");
	}
}
