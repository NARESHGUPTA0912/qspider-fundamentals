class CarDriver{
		
	public static void main(String[] args){
		Car c1=new Car("TATA");
		Car c2=new Car("Maruti");
		Car c3=new Car("MG", 234567.8);
		Car c4=new Car("Audi", 234567.8, 200);
		Car c5=new Car("BMW", 234567.8, 220, "Red");
		Car c6=new Car("Maruti", 434567.8, 250, "White");

		Car c7=new Car(c3);
		Car c8=new Car(c6);
		Car c9=new Car(c4);


		System.out.println(c1.getDetails());
		System.out.println(c2.getDetails());
		System.out.println(c3.getDetails());
		System.out.println(c4.getDetails());
		System.out.println(c5.getDetails());	
		System.out.println(c6.getDetails());
		System.out.println(c7.getDetails());
		System.out.println(c8.getDetails());	
		System.out.println(c9.getDetails());	
	}	
}



