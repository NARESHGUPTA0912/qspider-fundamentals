package while3;

class Program21_36 {

    // program 21 -> count digits of n that divide n
    public static int countDigitsThatDivNo(int n){
        int temp=n, count=0;
        while(temp>0){
            int d = temp%10;
            if (d!=0 && n%d == 0)
                count++;
            temp/=10;
        }
        return count;
    }

    // program 22 -> reverse number
    public static int reverseNumber(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev;
    }

    // program 23 -> check palindrome number
    public static boolean checkPalindrome(int n){
        int temp=n, rev=0;
        while(temp>0){
            rev=rev*10+(temp%10);
            temp/=10;
        }
        return n==rev;
    }

    // program 24
    public static boolean isPalindrome(int n){
        int temp=n, rev=0;
        while(temp>0){
            rev=rev*10+(temp%10);
            temp/=10;
        }
        return n==rev;
    }

    // program 25 -> palindrome string (using reverse)
    public static boolean isPalindromeString(String s){
        String rev="";
        int i=0;
        while(s.length()>i){
            rev = s.charAt(i)+rev;
            i++;
        }
        return s.equalsIgnoreCase(rev);
    }

    // program 26 -> palindrome string without creating reverse
    public static boolean isPalindromeStringAlt(String s){
        int start=0, end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;    end--;
        }
        return true;
    }

    // program 27 -> number of bits needed to represent n (floor log2 +1)
    public static int countNoOfBits(int n){
        int count=0;
        while(n>0){
            count++;    n/=2;
        }
        return count;
    }

    // program 28 -> count 1 bits in binary representation
    public static int countNoOf1Bits(int n){
        int count=0;
        while(n>0){
            if(n%2==1)
                count++;
            n/=2;
        }
        return count;
    }

    // program 29 -> returns int[]{ones, zeroes}
    public static int[] countNoOf0_1_Bits(int n){
        int ones=0, zeroes=0;
        while(n>0){
            if(n%2==1)
                ones++;
            else
                zeroes++;
            n/=2;
        }
        return new int[]{ones, zeroes};
    }

    // program 30 -> binary string representation
    public static String getBitsRepresentation(int n){
        if(n==0) return "0";
        String bits = "";
        while(n>0){
            bits = (n%2) + bits;
            n/=2;
        }
        return bits;
    }

    // program 31 -> check alternating bits
    public static boolean hasAlternatingBits(int n){
        int prev = -1;
        while(n>0){
            int curr = n%2;
            if(prev != -1 && curr == prev)
                return false;
            prev = curr;
            n/=2;
        }
        return true;
    }

    // program 32 -> steps to reduce to zero (divide by 2 if even else subtract 1)
    public static int countStepsToReduceNoToZero(int n){
        int steps = 0;
        while(n>0){
            n = n%2==0 ? n/2 : n-1 ;
            steps++;
        }
        return steps;
    }

    // program 33 -> trailing zeroes in n! (factorial)
    public static int trailingZeroes(int n){
        int count = 0;
        while(n>0){
            n/=5;
            count += n;
        }
        return count;
    }

    // program 34 -> check power of two
    public static boolean isPowerOfTwo(int n){
        if(n<=0) return false;
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }

    // program 35 -> check power of three
    public static boolean isPowerOfThree(int n){
        if(n<=0) return false;
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }

    // program 36 -> check power of four
    public static boolean isPowerOfFour(int n){
        if(n<=0) return false;
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(15));
    }
}