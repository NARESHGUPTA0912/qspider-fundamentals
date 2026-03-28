/*
A number is Harshad (Niven) number if:
👉 Number is divisible by sum of its digits

Example:
18 → 1 + 8 = 9 → 18 % 9 = 0 ✔
21 → 2 + 1 = 3 → 21 % 3 = 0 ✔
*/
public class HarshadNumber {

    // Helper: sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    // 1️⃣ Check Harshad Number
    public static boolean isHarshad(int n) {
        int sum = sumOfDigits(n);

        if (sum == 0) return false;

        return n % sum == 0;
    }

    // 2️⃣ Print and Count Harshad Numbers in range
    public static int printAndCountHarshad(int start, int end) {
        int count = 0;

        System.out.println("Harshad Numbers:");

        for (int i = start; i <= end; i++) {
            if (isHarshad(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Harshad Numbers: " + count);
        return count;
    }

    // 3️⃣ Kth Harshad Number
    public static int kthHarshadNumber(int k) {
        int count = 0;
        int num = 1;

        while (true) {
            if (isHarshad(num)) {
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
        printAndCountHarshad(1, 100);

        System.out.println("10th Harshad Number: " + kthHarshadNumber(10));
    }
}