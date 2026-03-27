package polymorphism.colorProject;

import java.util.Scanner;

class Machine {
    
    public static Color selectAndGetColor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Red");
        System.out.println("Press 2 for Green");
        System.out.println("Press 3 for Blue");
        System.out.println("Press 4 for Black");

        int choice =sc.nextInt();
        if(choice==1){
            System.out.println("You have selected Red Color");
            System.out.println("Enter the Quantity of Red Color in litres:");
            int quantity = sc.nextInt();
            Red red = new Red(quantity);
            return red;
        }
        else if(choice==2){
            System.out.println("You have selected Green Color");
            System.out.println("Enter the Quantity of Green Color in litres:");
            int quantity = sc.nextInt();
            Green green = new Green(quantity);
            return green;
        }
        else if(choice==3){
            System.out.println("You have selected Blue Color");
            System.out.println("Enter the Quantity of Blue Color in litres:");
            int quantity = sc.nextInt();
            Blue blue = new Blue(quantity);
            return blue;
        }
        else if(choice==4){
            System.out.println("You have selected Black Color");
            System.out.println("Enter the Quantity of Black Color in litres:");
            int quantity = sc.nextInt();
            Black black = new Black(quantity);
            return black;
        }
        else{
            System.err.println("Invalid Choice! Please select a valid color option.");
            return selectAndGetColor();
        }
    }

    public static boolean doYouWantToContinue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to continue - (Yes / No).");
        String ans = sc.next();
        return ans.equalsIgnoreCase("yes");
    }
}
