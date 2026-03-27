package switchcase;

import java.util.Scanner;

public class NumberOperationService {
    
    public static void selectNumberOperation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Factorial.");
        System.out.println("Press 2 for Power.");
        System.out.println("Press 3 for Multiplication Table of a number.");
        System.out.println("Press 4 for Multiplication Table upto n number.");
        int choice = sc.nextInt();

        switch(choice){
            case 1 -> {
                System.out.println("You have selected Factorial Operation.");
                System.out.println("Enter the Number: ");
                int n = sc.nextInt();
                int fact = 1 ;
                for(int i=1; i<=n; i++){
                    fact=fact*i;
                }
                System.out.println(n+"!= "+fact);
            }

            case 2 -> {
                System.out.println("You have selected Power Operation.");
                System.out.println("Enter Base: ");
                int base = sc.nextInt();
                System.out.println("Enter Exponent: ");
                int exp = sc.nextInt();
                int pow = Power.getPower(base, exp);
                System.out.println(base+" to the power of "+exp + " is "+pow);
            }

            case 3 -> {
                System.out.println("You have selected Table Operation.");
                System.out.println("Enter number: ");
                int k = sc.nextInt();
                Table.generateTable(k);
            }
            
            case 4 -> { 
                System.out.println("You have selected Table Operation.");
                System.out.println("Enter number: ");
                int p = sc.nextInt();
                Table.generateTableUptoNNumber(p);
            }
            default -> {
                System.out.println("Invalid Choice!");
                selectNumberOperation();
            }
        }
    }

    public static boolean doYouWantToContinue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to continue? (Yes/No)");
        String input = sc.nextLine();
        return input.equalsIgnoreCase("yes");
    }
}
