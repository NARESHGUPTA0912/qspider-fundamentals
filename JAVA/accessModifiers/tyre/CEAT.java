package accessModifiers.tyre;

public class CEAT {
    public static int x=10;
	protected static int y=20;
	static int z=30;
	private static int p=40;
	
	public CEAT(){
		
	}
	
	public static void test() {
		System.out.println("public test method");
	}
	protected static void demo() {
		System.out.println("protected demo method");
	}
	static void start() {
		System.out.println("default start method");
	}
	private static void drive() {
		System.out.println("private drive method");
	}
	public static void main(String[] args) {
		System.out.println("This is CEAT class");
		System.out.println("x is: "+x);
		test();
		System.out.println("y is: "+y);
		demo();
		System.out.println("z is: "+z);
		start();
		System.out.println("p is: "+p);
		drive();
	}
}
