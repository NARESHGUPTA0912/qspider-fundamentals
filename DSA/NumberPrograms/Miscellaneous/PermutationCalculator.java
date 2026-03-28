package Miscellaneous;
/*
👉 Permutation means arrangement of items where order matters
Example: ABC → ABC, ACB, BAC, BCA, CAB, CBA
*/
import java.util.Scanner;

public class PermutationCalculator {

    // 1️⃣ Factorial function
    public static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // 2️⃣ Permutation nPr
    public static long nPr(int n, int r) {
        if (r > n) return 0;

        return factorial(n) / factorial(n - r);
    }

    // 3️⃣ Total arrangements (n!)
    public static long totalArrangements(int n) {
        return factorial(n);
    }

    // 🔥 Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (total items): ");
        int n = sc.nextInt();

        System.out.print("Enter r (items to arrange): ");
        int r = sc.nextInt();

        System.out.println("n! (Total arrangements of n items): " + totalArrangements(n));

        System.out.println("nPr (Permutations): " + nPr(n, r));

        sc.close();
    }
}