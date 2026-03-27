package ploymorphism.methodOverloading;

public class MainOverload {
	public static void main(int args) {
		System.out.println("Main with int args");
	}
	public static void main(double args) {
		System.out.println("Main with double args");
	}
	public static void main(String[] args) {
		System.out.println("Main with String[] args");
		main(12.4);
		main("abcd");
		main();
	}
	public static void main(String args) {
		System.out.println("Main with String args");
	}
	public static void main() {
		System.out.println("Main with no args");
	}
}
