class Vehicle{
	static int x;
	static{
		test();
		System.out.println("This is static block-1 x is: "+x);
		x=90;
	}


	{
		System.out .println("Vehicle Object is Created");
	}

	public static void test(){
		System.out.println("This is test method");
		
	}
	
	static{
		System.out.println("This is static block-2 x is: "+x);
	}	
}



