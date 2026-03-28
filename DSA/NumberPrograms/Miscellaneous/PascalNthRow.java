package Miscellaneous;

import java.util.Scanner;

public class PascalNthRow {

    // 1️⃣ Print Nth row
    public static void printNthRow(int n) {
        int res = 1;

        System.out.print("Nth Row of Pascal Triangle: ");

        for (int i = 0; i <= n; i++) {
            System.out.print(res + " ");

            // update next value using nCr formula
            res = res * (n - i) / (i + 1);
        }

        System.out.println();
    }

    // 2️⃣ Store Nth row in array (optional but interview useful)
    public static int[] getNthRow(int n) {
        int[] row = new int[n + 1];
        int res = 1;

        for (int i = 0; i <= n; i++) {
            row[i] = res;
            res = res * (n - i) / (i + 1);
        }

        return row;
    }

    // 🔥 Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row number (0-based index): ");
        int n = sc.nextInt();

        printNthRow(n);

        int[] row = getNthRow(n);

        System.out.print("Stored Row: ");
        for (int val : row) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}