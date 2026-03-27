package polymorphism.vendingMachineProject;

public class Coffee extends Beverages{
    
    @Override
    public void drink() {
        System.out.println("Here is your coffee.\nEnjoy it while you drink!");
    }
}
