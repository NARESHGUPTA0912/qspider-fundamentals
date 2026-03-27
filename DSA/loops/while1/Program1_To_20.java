package while1;

import java.util.Scanner;

public class Program1_To_20 {
    
    static void Q1(){
        int n=1;
        while(n<=10)
            System.out.println(n++);
    }
    static void Q2(){
        int n=10;
        while(n>=1)
            System.out.println(n--);
    }
    static void Q3(){
        int n=1;
        while(n<=100){
            if(n%2==0) System.out.println(n);
            n++;
        }
    }
    static void Q4(){
        int n=1;
        while(n<=100){
            if(n%2!=0) System.out.println(n);
            n++;
        }
    }
    static void Q5(){
        int n=1;
        while(n<=100){
            if(n%7==0){
                System.out.println(n);
            }n++;
        }
    }
    static void Q6(){
        int n=1, count=0;
        while(n<=100){
            if(n%7==0){
                System.out.println(n);
                count++;
            }n++;
        }System.out.println("Total Count: "+count);
    }
    static void Q7(){
        int n=1, count=0;
        while(n<=100){
            if(n%7==0){
                count++;
            }n++;
        }System.out.println("Total Count: "+count);
    }
    static void Q8(){
        int n=1, count=0;
        for(int i=0; i<=100; i++){
            if(n%7==0||n%10==7){
                System.out.println(n);
                count++;
            }n++;
        }System.out.println("Total Count: "+count);
    }
    static void Q9(){
        int n=1, count=0;
        while(n<=1000){
            if(n%7==0&&n%10==7){
                System.out.println(n);
                count++;
            }n++;
        }System.out.println("Total Count: "+count);
    }
    static void Q10(){
        int i=1;
        while(i*i<=100){
            System.out.println(i*i);
            i++;
        }
    }
    static void Q11(){
        int i=1,count=0;
        while(i*i<=100){
            System.out.println(i*i);
            i++;    count++;
        }System.out.println("Total Count: "+count);
    }
    static void Q12(){
        int n=100;  // number of bulbs
        int i=1;
        while(i*i<=n){
            System.out.println("Bulb "+i*i+" is ON");
            i++;
        }
    }
    static void Q13(){
        int i=1;
        while(i*i*i<=100){
            System.out.println(i*i*i);
            i++;
        }
    }
    static void Q14(){
        int i=1, count=0;
        while(i*i*i<=100){
            System.out.println(i*i*i);
            i++;    count++;
        }System.out.println("Total Count: "+count);
    }

    static void Q15(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            if(n%i==0){
                System.out.print(i+" ");
            }i++;
        }
    }
    static void Q16(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i=1,count=0;
        while(i<=n){
            if(n%i==0) count++;
            i++;
        }
        System.out.println("\nTotal Count of Divisors: "+count);
    }
    static void Q17(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i=1,count=0;
        while(i<=n){
            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }i++;
        }
        System.out.println("\nTotal Count of Divisors: "+count);
    }
    public static void isThreeQ18(int n) {
        n=28;
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println("Total Count of Divisors: "+count);
    }
    public int kthFactorQ19(int n, int k) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // i is a factor
                k--;
                if (k == 0)
                    return i;
            }
        }
        return -1;
    }

    // Solution 20
    public static int commonFactorsQ20(int a, int b) {
        int g = gcd(a, b);
        int count = 0;
        for (int i = 1; i <= g; i++)
            if (g % i == 0) count++;
        return count;
    }
    private static int gcd(int a, int b) {     // Euclidean Algorithm
        while (b != 0) {
            int temp = a % b;
            a = b;  b = temp;
        }return a;
    }

    public static void main(String[] args) {
        Q9();
    }
}
