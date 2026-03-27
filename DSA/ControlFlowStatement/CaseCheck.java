package ControlFlowStatement;

import java.util.Scanner;

class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase Alphabet");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase Alphabet");
        else
            System.out.println("Not an Alphabet");
        sc.close();
    }
}
