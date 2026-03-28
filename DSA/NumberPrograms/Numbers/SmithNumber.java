/**
   A Smith number is a composite number whose:
👉 Sum of digits = Sum of digits of its prime factors (with repetition)

Example:
4 = 2 × 2 → (2 + 2) = 4 ✔
27 = 3 × 3 × 3 → (3 + 3 + 3) = 9 ✔
58 = 2 × 29 → (2) + (2+9) = 13 ✔
 */

public class SmithNumber {

    // Helper: sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Helper: check prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    // Helper: sum of digits of prime factors
    public static int sumPrimeFactorDigits(int n) {
        int sum = 0;

        // factor 2
        while (n % 2 == 0) {
            sum += sumOfDigits(2);
            n /= 2;
        }

        // factor 3
        while (n % 3 == 0) {
            sum += sumOfDigits(3);
            n /= 3;
        }

        // 6k ± 1 optimization
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                sum += sumOfDigits(i);
                n /= i;
            }
            while (n % (i + 2) == 0) {
                sum += sumOfDigits(i + 2);
                n /= (i + 2);
            }
        }

        // remaining prime factor
        if (n > 1) {
            sum += sumOfDigits(n);
        }

        return sum;
    }

    // 1️⃣ Check Smith Number
    public static boolean isSmith(int n) {
        if (n < 2 || isPrime(n)) return false;

        int digitSum = sumOfDigits(n);
        int factorSum = sumPrimeFactorDigits(n);

        return digitSum == factorSum;
    }

    // 2️⃣ Print and Count Smith Numbers
    public static int printAndCountSmith(int start, int end) {
        int count = 0;

        System.out.println("Smith Numbers:");

        for (int i = start; i <= end; i++) {
            if (isSmith(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Smith Numbers: " + count);
        return count;
    }

    // 3️⃣ Kth Smith Number
    public static int kthSmithNumber(int k) {
        int count = 0;
        int num = 1;

        while (true) {
            if (isSmith(num)) {
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
        printAndCountSmith(1, 200);

        System.out.println("5th Smith Number: " + kthSmithNumber(5));
    }
}