package dowhile;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            boolean isPrime = true;

            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime)
                System.out.println(n + " is a Prime number");
            else
                System.out.println(n + " is NOT a Prime number");

            System.out.print("Press Y/y to continue or any other key to exit: ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Program Ended.");
        sc.close();
    }
}

