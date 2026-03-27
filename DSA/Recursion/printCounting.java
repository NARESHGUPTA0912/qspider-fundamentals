package Recursion;

public class printCounting {
    
    public static void printCountAscending(int n){
        if(n==0){
            return;
        }
        printCountAscending(n-1);
        System.out.println(n);
    }

    public static void printCountDescending(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printCountDescending(n-1);
    }

    public static void printCountBothWays(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printCountBothWays(n-1);
        System.out.println(n);
    }

    public static void printTable(int n, int i){
        if(i>10){
            return;
        }
        System.out.println(n+" x "+i+" = "+(n*i));
        printTable(n, i+1);
    }

    public static void main(String[] args) {
        // int num = 10;
        printTable(6, 1);
    }
}
