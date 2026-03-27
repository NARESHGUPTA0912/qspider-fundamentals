package dowhile;

import java.util.Scanner;

public class SumOfPositiveInteger {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the +ve numbers. \nIf you want result then enters 0 or -ve number.");
        do{
            num = sc.nextInt();
            sum += num;
        }while(num>0);
        System.out.println("Sum of all +ve numbers is: "+sum);
        System.out.println("===========Program Ends=========");
    }
}
