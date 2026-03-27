package Others;
class Fruit {
    static int b = 20;
}

class Vehicle2 {
    static int a = 48;
}

public class Program{
	public static void main(String[] args){
		System.out.println("This is my JAVA-Program");
		System.out.println("Java Program".length());
		System.out.println("Java Program".charAt(3));
		System.out.println("Java Program".toUpperCase());
		System.out.println("Java Program".toLowerCase());
		System.out.print("12+30*4=");
		System.out.println(12+30*4);
		System.out.println(Vehicle2.a);
		System.out.println(Fruit.b);
		System.out.println("Program Ends");
	}
}
