/*
Fibonacci Series is a series where:
0, 1, 1, 2, 3, 5, 8, 13, ...
👉 Rule:
F(n) = F(n-1) + F(n-2)
*/

public class FibonacciSeries {

    // 1️⃣ Print Fibonacci Series up to n terms
    public static void printFibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    // 2️⃣ Find Nth Fibonacci Term
    public static int nthFibonacci(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        int a = 0, b = 1, c = 0;

        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    // 🔥 Main method
    public static void main(String[] args) {
        int n = 10;

        printFibonacci(n);

        System.out.println(n + "th Fibonacci term: " + nthFibonacci(n));
    }
}
