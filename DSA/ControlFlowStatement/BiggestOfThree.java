package ControlFlowStatement;

import java.util.Scanner;

class BiggestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("All are equal");
        else if (a > b && a > c)
            System.out.println(a + " is biggest");
        else if (b > c)
            System.out.println(b + " is biggest");
        else
            System.out.println(c + " is biggest");
        sc.close();
    }
}

