package polymorphism.vendingMachineProject;

public class Driver {
    
    public static void main(String[] args) {
        do { 
            Beverages beverage = VendingMachine.pressButtonAndGetBeverage();
            beverage.drink();
        } while (VendingMachine.doYouWantToContinue());
        System.out.println("Thank you for using the Vending Machine. Goodbye!");
    }
}
