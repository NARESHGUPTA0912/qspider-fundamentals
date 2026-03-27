class RectangleDriver{
	public static void main(String[] args){
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		Rectangle r3=new Rectangle();

		r1.l=8.2;
		r1.w=6.3;
		r2.l=18.2;
		r2.w=8.3;
		r3.l=16.2;
		r3.w=8.3;
		
		r1.printArea();
		r1.printPerimeter();
		System.out.println("===================");
		r2.printArea();
		r2.printPerimeter();
		System.out.println("===================");
		r3.printArea();
		r3.printPerimeter();
		System.out.println("===================");

	}	
}



