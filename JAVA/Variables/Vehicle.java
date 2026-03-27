class Vehicle {
    // static variable (common for all vehicles)
    static String manufacturer = "Tata Motors";

    // instance variables (unique for each vehicle)
    String model;
    String color;
    double price;

    // method to get vehicle info
    public void getVehicleInfo() {
        // local variable
        String fuelType = "Petrol";  

        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("----------------------------------");
    }

    public void setVehicleInfo(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
