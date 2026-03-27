class Average{
	public static void printAverage(double a, double b, double c){
		double avg=(a+b+c)/3;

		System.out.println("The average of "+a+","+b+" and "+c+" is: "+avg);
	}

	public static void main(String[] args){
		printAverage(10, 26, 31);
		System.out.println("===================");
		printAverage(28.2, 26.4, 40);
		System.out.println("===================");
		double x=12.4;
		double y=30.2;
		double z=10.3;
		printAverage(x, y, z);
		System.out.println("===================");
		double p=23;
		double q=40;
		double r=60;
		printAverage(p,q,r);
	}
}



