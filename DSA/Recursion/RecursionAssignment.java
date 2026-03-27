package Recursion;

public class RecursionAssignment {
    
    // program 1(a)
    static void print1to10(int n){
        if (n > 10) return;
        System.out.print(n+" ");
        print1to10(n+1);
    }
    
    // program 1(b)
    static void print10to1(int n){
        if (n == 0) return;
        System.out.print(n+" ");    // descending
        print10to1(n-1);
    }

    // program 1 (c)
    static void printCounting(int n){
        if (n == 0) return;
        System.out.print(n+" ");    // descending
        print10to1(n-1);
    //  System.out.print(n+" ");    // ascending
    }

    // program 2
    static void table(int n, int i){
        if (i > 10) return;
        System.out.println(n+" X "+i+" = "+(n*i));
        table(n, i+1);
    }

    // program 3
    static int sum(int n){
        if(n==0) return 0;
        return n + sum(n-1);
    }

    // program 4
    static int sumSquares(int n){
        if(n==0) return 0;
        return n*n + sumSquares(n-1);
    }

    // program 5
    static int sumCubes(int n){
        if(n==0) return 0;
        return n*n*n + sumCubes(n-1);
    }

    // program 6
    static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }

    // program 7
    static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    // program 8
    static int digitCount(int n) {
        if (n == 0) return 0;
        return 1 + digitCount(n / 10);
    }

    // program 9
    static int digitSum(int n){
        if(n==0) return 0;
        return (n % 10) + digitSum(n / 10);
    }

    // program 10
    static int rev(int n, int r) {
        if (n == 0) return r;
        return rev(n / 10, r * 10 + n % 10);
    }

    // program 11
    static boolean isPalindrome(int n) {
        return n == rev(n, 0);
    }

    // program 12
    static int max4(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    // program 13
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    // program 14
    static int trib(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        return trib(n - 1) + trib(n - 2) + trib(n - 3);
    }

    // program 15
    static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }

    // program 16
    static boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 3 != 0) return false;
        return isPowerOfThree(n / 3);
    }


    // program 17
    static boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 4 != 0) return false;
        return isPowerOfFour(n / 4);
    }

    // program 18
    static int hcf(int a, int b) {
        if (b == 0) return a;
        return hcf(b, a % b);
    }

    // program 19
    static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }

    // program 20
    static void toh(int n, char from, char aux, char to) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        toh(n - 1, from, to, aux);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        toh(n - 1, aux, from, to);
    }

    // program 21
    static boolean ugly(int n) {
        if (n == 1) return true;
        if (n <= 0) return false;
        if (n % 2 == 0) return ugly(n / 2);
        if (n % 3 == 0) return ugly(n / 3);
        if (n % 5 == 0) return ugly(n / 5);
        return false;
    }

    public static void main(String[] args) {
        // table(7, 1);
        // System.out.println("Sum is: "+sum(100));
        System.out.println(sumSquares(100));
        System.out.println(sumCubes(100));
    }
}