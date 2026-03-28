/*
 A number is Strong if:
👉 Sum of factorial of each digit = original number
Example:
145 = 1! + 4! + 5! = 1 + 24 + 120 = 145 ✔
*/
public class StrongNumber {

    // Helper: factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 1️⃣ Check if number is Strong
    public static boolean isStrong(int n) {
        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }

        return sum == original;
    }

    // 2️⃣ Print and Count Strong numbers in range
    public static int printAndCountStrong(int start, int end) {
        int count = 0;

        System.out.println("Strong Numbers:");

        for (int i = start; i <= end; i++) {
            if (isStrong(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Strong Numbers: " + count);
        return count;
    }

    // 🔥 Main method for testing
    public static void main(String[] args) {
        printAndCountStrong(1, 500);
    }
}