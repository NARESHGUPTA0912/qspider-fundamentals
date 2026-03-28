/*
Tribonacci Series is like Fibonacci, but:
👉 Sum of previous 3 terms

Example:
0, 1, 1, 2, 4, 7, 13, 24, ...
Formula: 
T(n) = T(n-1) + T(n-2) + T(n-3)
 */

public class TribonacciSeries {

    // 1️⃣ Print Tribonacci Series up to n terms
    public static void printTribonacci(int n) {
        if (n <= 0) return;

        int a = 0, b = 1, c = 1;

        System.out.print("Tribonacci Series: ");

        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");
        if (n >= 3) System.out.print(c + " ");

        for (int i = 4; i <= n; i++) {
            int d = a + b + c;
            System.out.print(d + " ");

            a = b;
            b = c;
            c = d;
        }

        System.out.println();
    }

    // 2️⃣ Find Nth Tribonacci Term
    public static int nthTribonacci(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (n == 3) return 1;

        int a = 0, b = 1, c = 1, d = 0;

        for (int i = 4; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }

        return d;
    }

    // 🔥 Main method
    public static void main(String[] args) {
        int n = 10;

        printTribonacci(n);

        System.out.println(n + "th Tribonacci term: " + nthTribonacci(n));
    }
}