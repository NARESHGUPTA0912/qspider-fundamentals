package switchcase;

public class NumberOperationDriver {
    public static void main(String[] args) {
        do { 
            NumberOperationService.selectNumberOperation();
        } while (NumberOperationService.doYouWantToContinue());
        System.out.println("Thank You for use our Application. Now Application is Ends.");
    }
}
