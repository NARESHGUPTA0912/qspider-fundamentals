/**
 A number is Happy if:
👉 Repeatedly replace the number by sum of squares of its digits
👉 If it eventually becomes 1 → Happy number ✔
👉 If it enters a loop → Not happy ❌

Example:
19 → 1² + 9² = 82 → 68 → 100 → 1 ✔
 */

public class HappyNumber {

    // Helper: sum of square of digits
    public static int sumOfSquareDigits(int n) {
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    // 1️⃣ Check Happy Number
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        // Floyd Cycle Detection
        do {
            slow = sumOfSquareDigits(slow);
            fast = sumOfSquareDigits(sumOfSquareDigits(fast));
        } while (slow != fast);

        return slow == 1;
    }

    // 2️⃣ Print and Count Happy Numbers in range
    public static int printAndCountHappy(int start, int end) {
        int count = 0;

        System.out.println("Happy Numbers:");

        for (int i = start; i <= end; i++) {
            if (isHappy(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Happy Numbers: " + count);
        return count;
    }

    // 3️⃣ Kth Happy Number
    public static int kthHappyNumber(int k) {
        int count = 0;
        int num = 1;

        while (true) {
            if (isHappy(num)) {
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
        printAndCountHappy(1, 100);

        System.out.println("5th Happy Number: " + kthHappyNumber(5));
    }
}