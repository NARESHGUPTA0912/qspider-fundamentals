package dowhile;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        do {
            System.out.print("Enter the Number: ");
            int num = sc.nextInt();
        long fact = getFactorial(num);
            System.out.println("Factorial of given number is: "+fact);
            System.out.println("Press Y/y to continue...");
            c=sc.next().charAt(0);
        } while(c=='Y' || c=='y');
		System.out.println("======Program Ends=========");
    }

    private static long getFactorial(int num) {
        long fact=1, i=1;
        while(i<=num){
            fact*=i;
            i++;
        }
        return fact;
    }
}
