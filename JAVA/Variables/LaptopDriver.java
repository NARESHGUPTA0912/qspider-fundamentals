class LaptopDetails {
    static String brand = "HP";   // static variable

    // non-static variable or instance variable
    String color;
    String model;
    double price;

    public void setLaptopDetails(String color, String model, double price) {
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public void getLaptopSpecifications () {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class LaptopDriver {
    public static void main(String[] args) {
        LaptopDetails laptop = new LaptopDetails();
        laptop.setLaptopDetails("Silver", "Pavilion", 750.00);
        laptop.getLaptopSpecifications();
    }
}
