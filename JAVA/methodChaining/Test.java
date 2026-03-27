package methodChaining;

public class Test {
    public static void main(String[] args) {
		start();
		drive();
		int l=run().length();
		System.out.println("length is: "+l);
		String s=run().toUpperCase().substring(2);
		System.out.println(s);
	}
	
	public static void start() {
		System.out.println("Start method");
	}
	public static int drive() {
		System.out.println("drive method");
	return 12;
	}
	public static String run() {
		System.out.println("run method");
	return "abcde";
	}
}
