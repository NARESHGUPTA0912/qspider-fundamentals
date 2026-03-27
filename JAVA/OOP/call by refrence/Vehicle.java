class Vehicle{
	double price=120000;
	public static void main(String[] args){
		Vehicle v1=new Vehicle();
		System.out.println("Vehicle price is: "+v1.price);//Vehicle price: 1200000
		test(v1);//call by refrence
		System.out.println("Vehicle price is: "+v1.price);//Vehicle price: 500000	
	}

	public static void test(Vehicle v){
		v.price=500000;
	}
	
}



