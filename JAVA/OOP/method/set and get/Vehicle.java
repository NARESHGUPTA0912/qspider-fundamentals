class Vehicle{
	String name;
	double price;
	String color;	

	public void setDetails(String n, double p, String c){
		name=n;
		price=p;
		color=c;
	}

	public void printDetails(){
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("Color is: "+color);
		System.out.println("==================");
	}
}



