package Miscellaneous;

import java.util.Scanner;
/*
🧠 What is Combination?

👉 Combination means selection (order does NOT matter)

Example:

ABC → AB, AC, BC (not permutations)
📌 Formula
✔ Combination:
nCr = n! / (r! × (n - r)!)
📌 Total number of selections

👉 If you can select any number of items (0 to n):

Total selections = 2^n

👉 (including empty set)
*/

public class CombinationCalculator {

    // 1️⃣ Factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 2️⃣ nCr (Combination)
    public static long nCr(int n, int r) {
        if (r > n) return 0;

        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // 3️⃣ Total ways of selection (power set)
    public static long totalSelections(int n) {
        return (long) Math.pow(2, n);
    }

    // 🔥 Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        System.out.println("nCr (Combinations): " + nCr(n, r));
        System.out.println("Total selections (2^n): " + totalSelections(n));

        sc.close();
    }
}