/* A number is Disarium if:
👉 Sum of digits powered by their position (starting from 1) = original number

Example:
135 = 1¹ + 3² + 5³ = 135 ✔
89 = 8¹ + 9² = 89 ✔
*/
public class DisariumNumber {

    // Helper: count digits
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Helper: power function
    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    // 1️⃣ Check Disarium Number
    public static boolean isDisarium(int n) {
        int original = n;
        int sum = 0;

        int digits = countDigits(n);

        // store digits in array for correct left-to-right position
        int[] arr = new int[digits];

        for (int i = digits - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }

        for (int i = 0; i < digits; i++) {
            sum += power(arr[i], i + 1);
        }

        return sum == original;
    }

    // 2️⃣ Print and Count Disarium Numbers in range
    public static int printAndCountDisarium(int start, int end) {
        int count = 0;

        System.out.println("Disarium Numbers:");

        for (int i = start; i <= end; i++) {
            if (isDisarium(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Disarium Numbers: " + count);
        return count;
    }

    // 3️⃣ Kth Disarium Number
    public static int kthDisariumNumber(int k) {
        int count = 0;
        int num = 1;

        while (true) {
            if (isDisarium(num)) {
                count++;
                if (count == k) {
                    return num;
                }
            }
            num++;
        }
    }

    // 🔥 Main method for testing
    public static void main(String[] args) {
        printAndCountDisarium(1, 1000);

        System.out.println("5th Disarium Number: " + kthDisariumNumber(5));
    }
}