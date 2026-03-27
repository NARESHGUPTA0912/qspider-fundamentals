package MultiThreading;

public class VehicleDriver {
    public static void main(String[] args) {
		Vehicle v1=new Vehicle("Car",23);
		Vehicle v2=new Vehicle("Bike",23);
		Vehicle v3=new Vehicle("Truck",23);
		Vehicle v4=new Vehicle("Bus",23);
		
		v1.start();
		v2.start();
		v3.start();
		v4.start();
		
	}
}
