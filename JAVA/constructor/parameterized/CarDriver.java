package constructor.parameterized;

class CarDriver{
		
	public static void main(String[] args){
		Car c1=new Car("TATA");
		Car c2=new Car("Maruti");
		Car c3=new Car("MG", 234567.8);
		Car c4=new Car("Audi", 234567.8, 200);
		Car c5=new Car("BMW", 234567.8, 220, "Red");

		System.out.println(c1.getDetails());
		System.out.println(c2.getDetails());
		System.out.println(c3.getDetails());
		System.out.println(c4.getDetails());
		System.out.println(c5.getDetails());
	}
}



