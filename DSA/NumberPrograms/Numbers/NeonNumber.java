/*
A number is Neon if:
👉 Sum of digits of its square = original number
Example:
9 → 9² = 81 → 8 + 1 = 9 ✔
1 → 1² = 1 → 1 ✔
*/
public class NeonNumber {

    // Helper: sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    // 1️⃣ Check Neon Number
    public static boolean isNeon(int n) {
        int square = n * n;

        int digitSum = sumOfDigits(square);

        return digitSum == n;
    }

    // 2️⃣ Print and Count Neon Numbers in range
    public static int printAndCountNeon(int start, int end) {
        int count = 0;

        System.out.println("Neon Numbers:");

        for (int i = start; i <= end; i++) {
            if (isNeon(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Neon Numbers: " + count);
        return count;
    }

    // 3️⃣ Kth Neon Number
    public static int kthNeonNumber(int k) {
        int count = 0;
        int num = 1;

        while (true) {
            if (isNeon(num)) {
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
        printAndCountNeon(1, 100);

        System.out.println("2nd Neon Number: " + kthNeonNumber(2));
    }
}