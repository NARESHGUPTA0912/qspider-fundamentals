package Structure;

class Vehicle {

    String vehicleName;
    int vehicleQuantity;
    double vehiclePrice;
    String vehicleColor;

}

public class VehicleDetails{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.vehicleName = "Splendor";
        System.out.println("Vehicle Name: " + v.vehicleName);
        v.vehicleQuantity = 2;
        System.out.println("Vehicle Quantity: " + v.vehicleQuantity);
        v.vehiclePrice = 70999.99;
        System.out.println("Vehicle Price: " + v.vehiclePrice);
        v.vehicleColor = "Magenta";
        System.out.println("Vehicle Color: " + v.vehicleColor);
        System.out.println("Vehicle Address: " + v);
    }
}

