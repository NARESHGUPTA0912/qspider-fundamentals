package ploymorphism.methodOverloading;

public class Driver {
	public static void main(String[] args) {
		Calculator.add(12, 34.5);
		Calculator.add(12, 40);
		Calculator.add(18, 40.4, 33.2);
		Calculator.add(24.1, 22.2, 26.3);
		Calculator.add(23.5, 44);
		
		System.out.println(12+45);
		System.out.println(12+4.5);
		System.out.println("12+45");
		
	}

}
