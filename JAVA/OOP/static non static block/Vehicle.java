class Vehicle{
	static int x;
	//static block
	static{
		System.out.println("This is Vehicle class static block-1 x is: "+x);
		x=40;
	}
	//non-static block
	{
		System.out.println("Vehicle Object is created");
	}
	//static block
	static{
		System.out.println("This is Vehicle class static block-2 x is: "+x);
	}	
}



