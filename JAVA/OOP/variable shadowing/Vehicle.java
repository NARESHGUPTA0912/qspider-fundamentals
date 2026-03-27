class Vehicle{
	static int x;
	public static void setX(int x){
		Vehicle.x=x;
	}

	public static void main(String[] args){
		System.out.println("x of vehicle is: "+Vehicle.x);
		setX(73);
		System.out.println("x of vehicle is: "+Vehicle.x);
		Vehicle.x=93;
		System.out.println("x of vehicle is: "+Vehicle.x);
			
	}
	
}



