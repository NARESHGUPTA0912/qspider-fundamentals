package ControlFlowStatement;

import java.util.Scanner;

class CharTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase Alphabet");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("lowercase alphabet");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
        sc.close();
    }
}

