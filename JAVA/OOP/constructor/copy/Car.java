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
		this(name);
		this.price=price;	
	}
	Car(String name, double price, int hp){
		this(name, price);
		this.hp=hp;	
	}
	Car(String name, double price, int hp, String color){
		this(name, price, hp);
		this.color=color;	
	}
	//Copy Constructor
	Car(Car p){
		this(p.name, p.price, p.hp, p.color);
	}

	/*Car(Car p){
		this.name=p.name;
		this.price=p.price;
		this.hp=p.hp;
		this.color=p.color;
	}*/
	public String getDetails(){
	return "Name: "+name+"\tPrice: "+price+"\tHP: "+hp+"\tColor: "+color;
	}

}



