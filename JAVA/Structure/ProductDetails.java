package Structure;
class Product {

    String productName;
    int productQuantity;
    double productPrice;
    String productColor;

}

public class ProductDetails{
    public static void main(String[] args) {
        Product p1= new Product();
        p1.productName = "Jordan";
        System.out.println("Product Name: " + p1.productName);
        p1.productQuantity = 4;
        System.out.println("Product Quantity: " + p1.productQuantity);
        p1.productPrice = 7999.99;
        System.out.println("Product Price: " + p1.productPrice);
        p1.productColor = "White";
        System.out.println("Product Color: " + p1.productColor);
        System.out.println("Product Address: " + p1);
    }
}

