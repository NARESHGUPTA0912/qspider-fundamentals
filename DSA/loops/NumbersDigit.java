public class NumbersDigit {

    public static int getDifference(int n){
        int big = n%10;
        int small = n%10;
        n /= 10;
        while(n>0){
            int rem = n%10;
            if (rem>big){
                big = rem;
            } else if (rem < small){
                small = rem;
            }
            n /= 10;
        }
        int digit = big-small;
        return digit;
    }

    public static void printDigitFromLtoR(int n){
        int count = (n+"").length();
        while(count>0){
            int digit = (int) (n/Math.pow(10,count-1)) % 10;
            System.out.println(digit);
            count--;
        }
    }

    public static void main(String[] args) {
        System.out.println("Difference is: " + getDifference(17092));
        System.out.println("Digit from L to R: " + printDigitFromLtoR(21354));
    }
}
