package Recursion;

public class NaturalNumber {
    public static int getSum(int n){
        if(n==1){
            return 1;
        }
        return n+getSum(n-1);
    }
    public static int getFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*getFactorial(n-1);
    }

    public static int getCount(int n){
        if(n<=9){
            return 1;
        }
        return 1+getCount(n/10);
    }

    public static int getDigitSum(int n){
        if(n<=9){
            return n;
        }
        return (n%10)+getCount(n/10);
    }

    

    public static void main(String[] args) {
        int num = 384;
        int sum = getSum(num);
        // int fact = getFactorial(num);
        int count = getCount(num);
        int digitSum = getDigitSum(num);
        System.out.println("Sum is: "+sum);
        // System.out.println("Factorial of "+num+"! is: " + fact);
        System.out.println("Count is: "+count);
        System.out.println("Digit Sum is: "+digitSum);
    }
}
