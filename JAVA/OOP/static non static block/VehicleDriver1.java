class VehicleDriver1{

	static
	{
		System.out.println("VehicleDriver1 static block-1");	
	}


	public static void main(String[] args){
		System.out.println("VehicleDriver main method starts");
		System.out.println("x of vehicle is: "+Vehicle.x);
		System.out.println("x of vehicle again is: "+Vehicle.x);
		System.out.println("===================");
		String[] x={"avbc", "cde"};
		ProductDriver.main(null);		
	}
	static
	{
		System.out.println("VehicleDriver1 static block-2");	
	}
	
}



