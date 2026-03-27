package finalKeyword.immutableClass;

public class Driver {
    public static void main(String[] args){
        Car c1 = new Car("TATA", 987499, "UP147947");

        System.out.println("Car Name: "+c1.getName());
		System.out.println("Car Price: "+c1.getPrice());
		System.out.println("Car No: "+c1.getCarno());
        System.out.println("===================================");
        c1.display();
    }
}
