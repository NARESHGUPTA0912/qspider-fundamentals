class VehicleDriver{
	public static void main(String[] args){
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		Vehicle v3=new Vehicle();

		v1.brand="TATA";
		v1.model="Safari";
		v2.brand="MG";
		v2.model="Alto";
		v3.brand="Audi";
		v3.model="NANO";

		Vehicle.brand="Maruti";
		System.out.println("=======Vehicle1 Details=======");	
		System.out.println("Brand is: "+v1.brand);
		System.out.println("Model is: "+v1.model);
		System.out.println("=======Vehicle2 Details=======");	
		System.out.println("Brand is: "+v2.brand);
		System.out.println("Model is: "+v2.model);
		System.out.println("=======Vehicle3 Details=======");	
		System.out.println("Brand is: "+v3.brand);
		System.out.println("Model is: "+v3.model);

		System.out.println("=============================");
		Vehicle.test();
		v1.test();
		v2.test();
		v3.test();
		System.out.println("================");
		v1.printDetails();
		v2.printDetails();
		v3.printDetails();


	}	
}



