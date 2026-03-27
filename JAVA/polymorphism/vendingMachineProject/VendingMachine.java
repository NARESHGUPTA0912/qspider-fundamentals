package polymorphism.vendingMachineProject;

import java.util.Scanner;

public class VendingMachine {
    
    public static Beverages pressButtonAndGetBeverage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Coffee");
        System.out.println("Press 2 for Juice");
        System.out.println("Press 3 for Coke");
        System.out.println("Press 4 for Wine");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("You have selected Coffee.");
                Coffee coffee = new Coffee();
                return coffee;
            }
            case 2 -> {
                System.out.println("You have selected Juice.");
                Juice juice = new Juice();
                return juice;
            }
            case 3 -> {
                System.out.println("You have selected Coke.");
                Coke coke = new Coke();
                return coke;
            }
            case 4 -> {
                System.out.println("You have selected Wine.");
                Wine wine = new Wine();
                return wine;
            }
            default -> {
                System.err.println("Invalid Choice! Please select a valid beverage option.");
                return pressButtonAndGetBeverage();
            }
        }
    }

    public static boolean doYouWantToContinue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to continue - (Yes / No).");
        String ans = sc.nextLine();
        return ans.equalsIgnoreCase("yes");
    }
}
