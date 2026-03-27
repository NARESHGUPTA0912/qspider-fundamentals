package Structure;
// 1200 * 100/100
// if calc profit like 30% = 1200 * (100+30)/100
// if calc loss like 30% = 1200 * (100-30)/100

public class CalcPrice {
    public static void main(String[] args) {
        double price = 1200;
        double discount = 59;
        printDiscountPrice(price, discount);
    }

    public static void printDiscountPrice(double price, double discount){
        System.out.println("Price of shirt: " + price + "Rupees");
        System.out.println("Discount offered is: " + discount);
        double discountedPrice = price*(100-discount)/100;
        System.out.println("Price after discount: " + discountedPrice+ "Rupees");
    }
}
