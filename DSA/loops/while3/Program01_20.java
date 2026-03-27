package while3;

import java.util.*;

public class Program01_20 {

    // 1. Returns array of digits from right to left
    public static int[] getDigitsRtoL(int n){
        if(n==0) return new int[]{0};
        List<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++) arr[i]=list.get(i);
        return arr;
    }

    // 2. Returns array of even digits from right to left
    public static int[] getEvenDigitsRtoL(int n){
        List<Integer> list = new ArrayList<>();
        while(n>0){
            int digit = n%10;
            if (digit%2==0) list.add(digit);
            n/=10;
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++) arr[i]=list.get(i);
        return arr;
    }

    // 3. Returns array of odd digits from right to left
    public static int[] getOddDigitsRtoL(int n){
        List<Integer> list = new ArrayList<>();
        while(n>0){
            int digit = n%10;
            if (digit%2!=0) list.add(digit);
            n/=10;
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++) arr[i]=list.get(i);
        return arr;
    }

    // 4. Returns array of digits >= 5 from right to left
    public static int[] getDigitsGreaterOrEqual5(int n){
        List<Integer> list = new ArrayList<>();
        while(n>0){
            int digit = n%10;
            if (digit>=5) list.add(digit);
            n/=10;
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++) arr[i]=list.get(i);
        return arr;
    }

    // 5. Returns the biggest/largest digit in the number
    public static int getBiggestDigit(int n){
        if(n==0) return 0;
        int max=0;
        while(n>0){
            int digit = n%10;
            if (digit>max) max=digit;
            n/=10;
        }
        return max;
    }

    // 6. Returns difference between biggest and smallest digit
    public static int diffBigAndSmall(int n){
        if(n==0) return 0;
        int max=0, min=9;
        while(n>0){
            int digit = n%10;
            if (digit>max) max=digit;
            if (digit<min) min=digit;
            n/=10;
        }
        return max-min;
    }

    // 7. Counts total number of digits
    public static int countDigits(int n){
        if(n==0) return 1;
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }

    // 8. Counts number of zeroes in the number
    public static int countZeroes(int n){
        if(n==0) return 1;
        int count=0;
        while(n>0){
            int d=n%10;
            if(d==0) count++;
            n/=10;
        }
        return count;
    }

    // 9. Counts number of threes in the number
    public static int countThrees(int n){
        int count=0;
        while(n>0){
            int d=n%10;
            if(d==3) count++;
            n/=10;
        }
        return count;
    }

    // 10. Counts number of even digits
    public static int countEvenDigits(int n){
        int count=0;
        while(n>0){
            int d=n%10;
            if(d%2==0) count++;
            n/=10;
        }
        return count;
    }

    // 11. Counts number of odd digits
    public static int countOddDigits(int n){
        int count=0;
        while(n>0){
            int d=n%10;
            if(d%2!=0) count++;
            n/=10;
        }
        return count;
    }

    // 12. Counts digits that are <= 5
    public static int countDigitLessThanEqualFive(int n){
        int count=0;
        while(n>0){
            int d=n%10;
            if(d<=5) count++;
            n/=10;
        }
        return count;
    }

    // 13. Returns array of digits left-to-right using string
    public static int[] getDigitsLtoRFromString(String s){
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++) arr[i]=s.charAt(i)-'0';
        return arr;
    }
    // 14. Returns array of digits left-to-right without using string
    public static int[] getDigitsLtoR(int n){
        if(n==0) return new int[]{0};
        int temp = n, rev = 0, len=0;
        while(temp > 0){
            rev = rev*10 + (temp%10);
            temp/=10; len++;
        }
        int[] out = new int[len];
        int idx=0;
        while(rev>0){
            out[idx++]=rev%10;
            rev/=10;
        }
        return out;
    }

    // 15. Returns sum of all digits
    public static int sumOfAllDigits(int n){
        int sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    // 16. Returns sum of all even digits
    public static int sumOfAllEvenDigits(int n){
        int sum=0;
        while(n>0){
            int d=(n%10);
            if(d%2==0) sum+=d;
            n/=10;
        }
        return sum;
    }
    // 17. Returns sum of all odd digits
    public static int sumOfOddDigits(int n){
        int sum=0;
        while(n>0){
            int d=(n%10);
            if(d%2!=0) sum+=d;
            n/=10;
        }
        return sum;
    }

    // 18. Returns sum of digits that are <= 5
    public static int sumOfDigitLessThanEqualFive(int n){
        int sum=0;
        while(n>0){
            int d = n%10;
            if(d<=5) sum+=d;
            n/=10;
        }
        return sum;
    }

    // 19. Returns difference between product and sum of digits
    public static int productSumDiff(int n){
        int sum=0, product=1;
        if(n==0) return 1; // product 1 - sum 0
        while(n>0){
            int d = n%10;
            sum+=d; product*=d;
            n/=10;
        }
        return product - sum;
    }

    // 20. Returns digital root (repeated sum until single digit)
    public static int addDigits(int n){
        while(n>=10){
            int sum=0;
            while(n>0){
                sum+=(n%10);
                n/=10;
            }
            n=sum;
        }
        return n;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("addDigits(83712389) = " + addDigits(83712389));
    }
}
