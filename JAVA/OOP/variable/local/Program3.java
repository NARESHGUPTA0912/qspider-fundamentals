class Program3{
	public static void main(String[] args){
		int x=90;
		System.out.println("x is: "+x);
		{
			System.out.println("This is Block-1");
			int a=40;
			System.out.println("a is: "+a);
			System.out.println("x is: "+x);
		}
		System.out.println("x is: "+x);
		{
			System.out.println("This is Block-2");
			int b=50;
			System.out.println("b is: "+b);
			System.out.println("x is: "+x);
		}
		System.out.println("x is: "+x);
	}	
}



