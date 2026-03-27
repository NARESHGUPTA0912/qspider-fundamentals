class VehicleDriver{
	public static void main(String[] args){
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		Vehicle v3=new Vehicle();

		v1.model="Safari";
		v2.model="NANO";
		v2.color="RED";
		v3.color="RED";
		v2.brand="MARUTI";

		System.out.println("=====Vehicle1 details======");
		System.out.println("Object address is: "+v1);
		System.out.println("Brand is: "+v1.brand);
		System.out.println("Model is: "+v1.model);
		System.out.println("Color is: "+v1.color);
		System.out.println("=====Vehicle2 details======");
		System.out.println("Object address is: "+v2);
		System.out.println("Brand is: "+v2.brand);
		System.out.println("Model is: "+v2.model);
		System.out.println("Color is: "+v2.color);
		System.out.println("=====Vehicle3 details======");
		System.out.println("Object address is: "+v3);
		System.out.println("Brand is: "+v3.brand);
		System.out.println("Model is: "+v3.model);
		System.out.println("Color is: "+v3.color);




	}
}



