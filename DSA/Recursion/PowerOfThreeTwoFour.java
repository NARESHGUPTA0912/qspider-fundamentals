package Recursion;


public class PowerOfThreeTwoFour {
    public static boolean isPowerOfThree(int n){
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        return n%3==0 && isPowerOfThree(n/3);
    }
    public static boolean isPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        return n%2==0 && isPowerOfTwo(n/2);
    }
    public static boolean isPowerOfFour(int n){
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        return n%4==0 && isPowerOfFour(n/4);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(4096));
    }
}
