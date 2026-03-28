// A palindrome number is a number that remains the same when its digits are reversed. 
// For example, 121 and 12321 are palindrome numbers, while 123 and 10 are not.

public class PalindromeNumbers {

    // 1️⃣ Check if number is palindrome
    public static boolean isPalindrome(int n) {
        if (n < 0) return false;

        int original = n;
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        return original == rev;
    }

    // 2️⃣ Print and count palindrome numbers in range
    public static int printAndCountPalindrome(int start, int end) {
        int count = 0;

        System.out.println("Palindrome Numbers:");
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Palindromes: " + count);
        return count;
    }

    // 3️⃣ Find Kth palindrome number (starting from 1)
    public static int kthPalindromeNumber(int k) {
        int count = 0;
        int num = 1;

        while (true) {
            if (isPalindrome(num)) {
                count++;
                if (count == k) {
                    return num;
                }
            }
            num++;
        }
    }

    // 4️⃣ Check prime (helper function)
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

    // 5️⃣ Print & count palindrome primes in range
    public static int printAndCountPalindromePrime(int start, int end) {
        int count = 0;

        System.out.println("Palindrome Prime Numbers:");
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i) && isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Palindrome Primes: " + count);
        return count;
    }

    // 🔥 Main method for testing
    public static void main(String[] args) {
        printAndCountPalindrome(1, 2000);
        System.out.println(isPalindrome(010));

        System.out.println("\n5th Palindrome Number: " + kthPalindromeNumber(5));

        printAndCountPalindromePrime(1, 1000);
    }
}