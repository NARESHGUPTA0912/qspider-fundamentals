package polymorphism.colorProject;

public class Driver {
    public static void main(String[] args) {
        do { 
            Color c = Machine.selectAndGetColor();
            c.applyColor();
        } while (Machine.doYouWantToContinue());
        System.out.println("Thank you for using Color Application Machine!\nI'm at your Service Sir!!");
    }
}
