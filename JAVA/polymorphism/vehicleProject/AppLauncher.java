package polymorphism.vehicleProject;

public class AppLauncher {
    public static void main(String[] args) {
        do {
            GameDriver.startGame();
        } while (GameDriver.doYouWantToContinue());
        System.out.println("Thank you for playing the Vehicle Race Game!\nHope you enjoyed it!!");
    }
}
