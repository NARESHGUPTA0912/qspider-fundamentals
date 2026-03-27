class Program2{
	public static void add(double a, double b){
		double sum=a+b;	
		System.out.println("Sum of "+a+" and "+b+" is: "+sum);
	}
	public static void add(double a, double b, double c){
		double sum=a+b+c;	
		System.out.println("Sum of "+a+","+b+","+c+" is: "+sum);
	}

	public static void main(String[] args){
		System.out.println("====Program STarts===");
		add(12, 15);
		add(20.3, 18.4);
		add(10, 20, 30);
		System.out.println("====Program Ends===");	
	}
	
}



