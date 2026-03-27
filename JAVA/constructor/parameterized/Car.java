package constructor.parameterized;

class Car{
	String name;
	double price;
	int hp;
	String color;
	Car(){
	}

	Car(String name){
		this.name=name;	
	}
	Car(String name, double price){
		this.name=name;
		this.price=price;
	}
	Car(String name, double price, int hp){
		this.name=name;
		this.price=price;
		this.hp=hp;	
	}
	Car(String name, double price, int hp, String color){
		this.name=name;
		this.price=price;
		this.hp=hp;
		this.color=color;
	}
	public String getDetails(){
	return "Name: "+name+"\tPrice: "+price+"\tHP: "+hp+"\tColor: "+color;
	}

}



