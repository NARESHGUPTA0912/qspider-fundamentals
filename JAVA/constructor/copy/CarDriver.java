package constructor.copy;

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
		int a = 0;
		System.out.println(++a + " " + c1.getDetails());
		System.out.println(++a + " " + c2.getDetails());
		System.out.println(++a + " " + c3.getDetails());
		System.out.println(++a + " " + c4.getDetails());
		System.out.println(++a + " " + c5.getDetails());
		System.out.println(++a + " " + c6.getDetails());
		System.out.println(++a + " " + c7.getDetails());
		System.out.println(++a + " " + c8.getDetails());
		System.out.println(++a + " " + c9.getDetails());
	}	
}



