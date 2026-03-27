import java.util.Scanner;

public class BillingApp {

    public static void generateBill(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Total Price: ");
        double totalPrice = sc.nextDouble();
        System.out.println("Total Price is: " + totalPrice + "/-");
        if(totalPrice >= 10000){
            System.out.println("You got 40% Discount");
            double discountedPrice = totalPrice*0.6;
            System.out.println("You have to pay: " + discountedPrice + "/-");
        } else if(totalPrice >= 6000){
            System.out.println("You got 30% Discount");
            double discountedPrice = totalPrice*0.7;
            System.out.println("You have to pay: " + discountedPrice + "/-");
        } else if(totalPrice >= 3000){
            System.out.println("You got 18% Discount");
            double discountedPrice = totalPrice*0.82;
            System.out.println("You have to pay: " + discountedPrice + "/-");
        } else {
            System.out.println("You got 12% Discount");
            double discountedPrice = totalPrice*0.88;
            System.out.println("You have to pay: " + discountedPrice + "/-");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { 
            generateBill();
            System.out.println("Press 1 to continue.....");
            int choice = sc.nextInt();
            if(choice != 1){
                System.out.println(".....|Thank you|\n ....----Application ends----.....");
                return;
            }
            
        }
    }
}
