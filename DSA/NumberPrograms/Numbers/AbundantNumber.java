/*
A number is Abundant if:
👉 Sum of proper divisors > number

Proper divisors = all divisors except the number itself.
Example:

12 → 1 + 2 + 3 + 4 + 6 = 16 > 12 ✔
18 → 1 + 2 + 3 + 6 + 9 = 21 > 18 ✔
*/

public class AbundantNumber {

    // 1️⃣ Sum of proper divisors
    public static int sumOfProperDivisors(int n) {
        int sum = 1; // 1 is always a divisor (for n > 1)

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

    // 2️⃣ Check Abundant Number
    public static boolean isAbundant(int n) {
        if (n <= 1) return false;

        return sumOfProperDivisors(n) > n;
    }

    // 3️⃣ Print and Count Abundant Numbers in range
    public static int printAndCountAbundant(int start, int end) {
        int count = 0;

        System.out.println("Abundant Numbers:");

        for (int i = start; i <= end; i++) {
            if (isAbundant(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Abundant Numbers: " + count);
        return count;
    }

    // 4️⃣ Kth Abundant Number
    public static int kthAbundantNumber(int k) {
        int count = 0;
        int num = 1;

        while (true) {
            if (isAbundant(num)) {
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
        printAndCountAbundant(1, 100);

        System.out.println("5th Abundant Number: " + kthAbundantNumber(5));
    }
}