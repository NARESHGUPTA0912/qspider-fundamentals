/*A number is Deficient if:
👉 Sum of proper divisors < number

Example:
8 → 1 + 2 + 4 = 7 < 8 ✔
10 → 1 + 2 + 5 = 8 < 10 ✔
 */

public class DeficientNumber {

    // 1️⃣ Sum of proper divisors
    public static int sumOfProperDivisors(int n) {
        int sum = 1; // 1 is always a divisor for n > 1

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;

                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum;
    }

    // 2️⃣ Check Deficient Number
    public static boolean isDeficient(int n) {
        if (n <= 1) return true; // 1 is considered deficient

        return sumOfProperDivisors(n) < n;
    }

    // 3️⃣ Print and Count Deficient Numbers in range
    public static int printAndCountDeficient(int start, int end) {
        int count = 0;

        System.out.println("Deficient Numbers:");

        for (int i = start; i <= end; i++) {
            if (isDeficient(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Deficient Numbers: " + count);
        return count;
    }

    // 4️⃣ Kth Deficient Number
    public static int kthDeficientNumber(int k) {
        int count = 0;
        int num = 1;

        while (true) {
            if (isDeficient(num)) {
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
        printAndCountDeficient(1, 50);

        System.out.println("10th Deficient Number: " + kthDeficientNumber(10));
    }
}