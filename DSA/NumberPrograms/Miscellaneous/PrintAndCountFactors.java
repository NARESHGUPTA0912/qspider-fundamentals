package Miscellaneous;
import java.util.Scanner;

// This program prints all the factors of a given number and counts them.
// A factor of a number is an integer that divides the number without leaving a remainder.
public class PrintAndCountFactors {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count = 0;
            System.out.println("Factors of " + n + " are:");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                    count++;
                }
            }
            System.out.println("\nTotal number of factors: " + count);
        }
    }
}
