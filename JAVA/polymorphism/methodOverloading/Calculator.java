package ploymorphism.methodOverloading;
public class Calculator {
	
	public static void add(double a, double b) {
		System.out.println("Sum is: " + (a + b));
	}
	public static void add(double a, double b, double c) {
		System.out.println("Sum is: " + (a + b + c));
	}
	public static void add(int a, int b) {
		System.out.println("Sum is: " + (a + b));
	}
	public static void add(double p, double q, int r) {
		System.out.println("Sum is: " + (p+q+r));
	}
	public static void add(int a, double b) {
		System.out.println("Sum is: " + (a + b));
	}
	public static void add(double a, int b) {
		System.out.println("Sum is: " + (a + b));
	}
}
