public class Q15 {
    public static int getDigitSum(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        return sum;
    }
    public static int getDigitSumInOneDigit(int n){
        while(n>9){
            int sum = 0;
            while(n>0){
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        n = sum;
        }
        return n;
    }
    public static int getDifference(int n){
        int sum = 0;
        int product = 1;
        while(n>0){
            int rem = n%10;
            sum += rem;
            product *= rem;
            n = n/10;
        }
        return product-sum;
    }
    public static int getReverseNumber(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n /= 10;
        }
        return rev;
    }
    public static boolean isPalindromeNumber(int n){
        int rev = 0;
        int org_n = n;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n /= 10;
        }
        return org_n == rev;
    }


    public static void main(String[] args) {
        // System.out.println(getDigitSum(12345));
        // System.out.println(getDifference(12345));
        // System.out.println(getDigitSumInOneDigit(12345));
        // System.out.println(getReverseNumber(12345));
        System.out.println(isPalindromeNumber(1234321));
    }
}
