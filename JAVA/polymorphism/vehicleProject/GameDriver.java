package polymorphism.vehicleProject;

import java.util.Scanner;

public class GameDriver {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void startGame() {
            System.out.println("\n🚦 Vehicle Race Game 🚦");

            Vehicle car = new Car("Tesla", 120);
            Vehicle bike = new Bike("Yamaha", 100);
            Vehicle truck = new Truck("Volvo Truck", 80);
            Vehicle bus = new Bus("School Bus", 70);

            Vehicle[] vehicles = { car, bike, truck, bus };
            System.out.println("\nRace Started...\n");

            for (Vehicle v : vehicles) {
                v.start();
                v.move();
                System.out.println();
            }

            // Find winner
            Vehicle winner = vehicles[0];
            for (int i = 1; i < vehicles.length; i++) {
                if (vehicles[i].getSpeed() > winner.getSpeed()) {
                    winner = vehicles[i];
                }
            }

            System.out.println("🏁 Winner 🏁");
            System.out.println(winner.getName() + " wins the race!");
    }

    @SuppressWarnings("resource")
    public static boolean doYouWantToContinue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDo you want to play again? (Y/N): ");
        char choice = sc.next().charAt(0);
        return choice == 'Y' || choice == 'y';
    }
}


