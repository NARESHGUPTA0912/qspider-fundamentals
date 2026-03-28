/*
A number is Automorphic if:
👉 The square of the number ends with the number itself

Examples:
5 → 25 ✔ (ends with 5)
6 → 36 ✔
25 → 625 ✔
76 → 5776 ✔
*/

public class AutomorphicNumber {

    // Helper: count digits
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // 1️⃣ Check Automorphic Number
    public static boolean isAutomorphic(int n) {
        long square = (long) n * n;

        int digits = countDigits(n);

        // get last digits of square
        long lastPart = square % (long) Math.pow(10, digits);

        return lastPart == n;
    }

    // 2️⃣ Print and Count Automorphic Numbers in range
    public static int printAndCountAutomorphic(int start, int end) {
        int count = 0;

        System.out.println("Automorphic Numbers:");

        for (int i = start; i <= end; i++) {
            if (isAutomorphic(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Automorphic Numbers: " + count);
        return count;
    }

    // 3️⃣ Kth Automorphic Number
    public static int kthAutomorphicNumber(int k) {
        int count = 0;
        int num = 1;

        while (true) {
            if (isAutomorphic(num)) {
                count++;
                if (count == k) {
                    return num;
                }
            }
            num++;
        }
    }

    // 🔥 Main method
    public static void main(String[] args) {
        printAndCountAutomorphic(1, 1000);

        System.out.println("5th Automorphic Number: " + kthAutomorphicNumber(5));
    }
}