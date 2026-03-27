class VehicleDriver{
	public static void main(String[] args){
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		Vehicle v3=new Vehicle();

		v1.setDetails("TATA", 465477.5, "White");
		v2.setDetails("Maruti", 665477.5, "Black");
		v3.setDetails("MG", 885477.5, "Red");

		v1.printDetails();
		v2.printDetails();
		v3.printDetails();
	}	
}



