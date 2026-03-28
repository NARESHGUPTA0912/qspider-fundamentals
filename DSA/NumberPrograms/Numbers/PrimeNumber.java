// Prime numbers are natural numbers greater than 1 that have no positive divisors other than 1 and themselves.
// For example, the first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and so on.
public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("Prime numbers from 1 to 50:");
        printAndCountPrimes(1, 50);

        int k = 10;
        System.out.println("\n" + k + "th Prime Number: " + kthPrime(k));

        System.out.println("\nAlternate Prime Numbers (1 to 50):");
        printAlternatePrimes(1, 50);

        System.out.println("\nPrime Numbers with all digits also prime (1 to 100):");
        printAndCountPrimeWithPrimeDigits(1, 100);

        System.out.println("\nPrime Numbers with digit sum also prime (1 to 100):");
        printPrimeWithPrimeDigitSum(1, 100);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        // 6k ± 1 optimization
        // We use i <= n / i to avoid multiplication overflow and still maintain the condition i² ≤ n.
        for (int i = 5; i <= n / i; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // ✅ Faster range prime printing
    public static void printAndCountPrimes(int start, int end) {
        int count = 0;

        if (start <= 2 && end >= 2) {
            System.out.print(2 + " ");
            count++;
        }

        for (int i = Math.max(3, start); i <= end; i += 2) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Prime Numbers: " + count);
    }

    // ✅ Kth Prime (optimized skipping evens)
    public static int kthPrime(int k) {
        if (k == 1) {
            return 2;
        }

        int count = 1; // already counted 2
        int num = 3;

        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == k) {
                    return num;
                }
            }
            num += 2; // skip even numbers
        }
    }

    // ✅ Alternate primes
    public static void printAlternatePrimes(int start, int end) {
        int count = 0;

        if (start <= 2 && end >= 2) {
            System.out.print(2 + " ");
            count++;
        }

        for (int i = Math.max(3, start); i <= end; i += 2) {
            if (isPrime(i)) {
                count++;
                if ((count & 1) == 1) { // faster than % 2
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }

    // ✅ Digit prime check (optimized)
    public static boolean areDigitsPrime(int n) {
        while (n > 0) {
            int d = n % 10;
            if (d != 2 && d != 3 && d != 5 && d != 7) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    // ✅ Prime with prime digits
    public static void printAndCountPrimeWithPrimeDigits(int start, int end) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i) && areDigitsPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Such Numbers: " + count);
    }

    // ✅ Digit sum
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // ✅ Prime with prime digit sum
    public static void printPrimeWithPrimeDigitSum(int start, int end) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i) && isPrime(digitSum(i))) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Such Numbers: " + count);
    }
}
