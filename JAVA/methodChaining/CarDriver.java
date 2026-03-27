package methodChaining;

public class CarDriver {
    public static void main(String[] args) {
		Car c=Game.play();
		c.start();
		c.drive();
		System.out.println("==============");
		Game g1=new Game();
		Car c1=g1.play1();
		c1.drive();
		c1.start();
		System.out.println("=============================");
		Game.play().start().drive();
		System.out.println("=============================");
		new Game().play1().start().drive();
		
		
		System.out.println("=-==========================-=");
		Game g=new Game();
		g.play().start().start().drive();
	}
}
