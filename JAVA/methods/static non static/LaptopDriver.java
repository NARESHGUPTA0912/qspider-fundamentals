class LaptopDriver{
	public static void main(String[] args){
		Laptop l1=new Laptop();
		Laptop l2=new Laptop();
		Laptop l3=new Laptop();
		Laptop l4=new Laptop();
		Laptop l5=new Laptop();


		//l1.setDetails("HP", 10, 500, "Silver");
		l1.name="HP";
		l1.ram=10;
		l1.hd=500;
		l1.color="Silver";
		l2.name="Dell";
		l2.ram=8;
		l2.hd=1000;
		l2.color="Blue";
		l3.name="Lenovo";
		l3.ram=12;
		l3.hd=1024;
		l3.color="Red";

		l1.printDetails();
		l2.printDetails();
		l3.printDetails();
		l4.printDetails();
		l5.printDetails();

	}
}



