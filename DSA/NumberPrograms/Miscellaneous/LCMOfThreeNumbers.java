package Miscellaneous;

import java.util.Scanner;

public class LCMOfThreeNumbers {

    // 1️⃣ GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 2️⃣ LCM of two numbers
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b; // safe from overflow
    }

    // 3️⃣ LCM of three numbers
    public static int lcmOfThree(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }

    // 🔥 Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int result = lcmOfThree(a, b, c);

        System.out.println("LCM of three numbers is: " + result);

        sc.close();
    }
}