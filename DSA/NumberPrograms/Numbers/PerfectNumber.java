// Perfect numbers are positive integers that are equal to the sum of their proper divisors (excluding themselves).
// For example, the first few perfect numbers are 6(1+2+3), 28(1+2+4+7+14), 496(1+2+4+8+16+31+62+124+248),
public class PerfectNumber {

    public static void main(String[] args) {
        PrintAndCountPerfectNumbers(10000);

        int k = 3;
        System.out.println(k + "rd Perfect Number: " + KthPerfectNumber(k));
    }

    public static boolean isPerfect(int n) {
        if (n <= 1) return false;

        int sum = 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i; // Add the complementary divisor if it's different
                }
            }
        }
        return sum == n;
    }

    public static void PrintAndCountPerfectNumbers(int limit) {
        int count = 0;

        for (int i = 1; i <= limit; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Total Perfect Numbers: " + count);
    }

    public static int KthPerfectNumber(int k) {
        int count = 0;
        int num = 1;

        while (true) {
            if (isPerfect(num)) {
                count++;
                if (count == k) return num;
            }
            num++;
        }
    }
}