class ProductDetails {
    // static variable (common for all products)
    static String storeName = "Tech Store";

    // instance variables (different for each product)
    String name;
    double price;
    String category;

    // method using local variable
    public void getProductInfo() {
        double discount = 0.10;  // local variable
        double finalPrice = price - (price * discount);
        System.out.println("Store Name: " + storeName);
        System.out.println("Product Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Original Price: $" + price);
        System.out.println("Price After 10% Discount: $" + finalPrice);
        System.out.println("----------------------------------");
    }

    public void setProductInfo(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
}

public class ProductDriver {
    public static void main(String[] args) {
        ProductDetails p1 = new ProductDetails();
        p1.setProductInfo("Laptop", "Electronics", 1200.00);
        p1.getProductInfo();

        ProductDetails p2 = new ProductDetails();
        p2.setProductInfo("Smartphone", "Electronics", 1000.00);
        p2.getProductInfo();
    }
}