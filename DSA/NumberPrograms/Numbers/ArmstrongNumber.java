/*
A number is Armstrong if:
👉 Sum of digits each raised to power of number of digits = original number

Example:
153 = 1³ + 5³ + 3³ = 153 ✔
9474 = 9⁴ + 4⁴ + 7⁴ + 4⁴ ✔
*/

    // Helper: count digits
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Helper: power function (digit ^ power)
    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    // 1️⃣ Check Armstrong Number
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        int digits = countDigits(n);

        while (n != 0) {
            int digit = n % 10;
            sum += power(digit, digits);
            n /= 10;
        }

        return sum == original;
    }

    // 2️⃣ Print and Count Armstrong Numbers in range
    public static int printAndCountArmstrong(int start, int end) {
        int count = 0;

        System.out.println("Armstrong Numbers:");

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Armstrong Numbers: " + count);
        return count;
    }

    // 🔥 Main method for testing
    public static void main(String[] args) {
        printAndCountArmstrong(1, 10000);
    }
}
