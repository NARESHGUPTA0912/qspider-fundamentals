class Vehicle{
	String name;
	double price;
	String color;	

	public void setDetails(String name, double price, String color){
		this.name=name;
		this.price=price;
		this.color=color;
	}

	public void printDetails(){
		System.out.println("Name is: "+this.name);
		System.out.println("Price is: "+price);
		System.out.println("Color is: "+color);
		System.out.println("==================");
	}
}



