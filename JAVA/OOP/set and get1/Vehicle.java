class Vehicle{
	String name;
	double price;
	String color;	
	//Mutator or setter method
	public void setDetails(String name, double price, String color){
		this.name=name;
		this.price=price;
		this.color=color;
	}
	//Accessor or getter method
	public String   getDetails(){
	return "Name is: "+this.name+"\nPrice is: "+price+"\nColor is: "+color+"\n==******==";
	}


	public void printDetails(){
		System.out.println("Name is: "+this.name);
		System.out.println("Price is: "+price);
		System.out.println("Color is: "+color);
		System.out.println("==================");
	}
	
}










