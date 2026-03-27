class Rectangle{
	
	double a=45;


	public static void main(String[] args){
		double l1=12, w1=8;
		double l2=40.2, w2=18.3;
		double l3=20.5, w3=12.4;

		printDetails(l1,w1);
		printArea(l1,w1);
		printPerimeter(l1,w1);	
		System.out.println("======================");
		printDetails(l2,w2);
		printArea(l2,w2);
		printPerimeter(l2,w2);
		System.out.println("======================");
		printDetails(l3,w3);
		printArea(l3,w3);
		printPerimeter(l3,w3);		
	}
	public static void printDetails(double l, double w){
		System.out.println("Length is: "+l+" Unit");
		System.out.println("Width is: "+w+" Unit");
	}
	public static void printArea(double l, double w){
		double area=l*w;
		System.out.println("Area is: "+area+" Sq. Unit");
	}
	public static void printPerimeter(double l, double w){
		double perimeter=2*(l+w);
		System.out.println("Perimeter is: "+perimeter+" Unit");
	}
}



