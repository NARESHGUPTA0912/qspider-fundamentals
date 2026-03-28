package Miscellaneous;
import java.util.Scanner;

/*
Each number is:  nCr (row, column)
Example:
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1
🧠 Formula used:  nCr = n! / (r! * (n - r)!)
But we optimize using:  nCr = (nCr * (n - r)) / (r + 1)
*/

public class PascalTriangle {

    // 1️⃣ Compute nCr efficiently
    public static int nCr(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    // 2️⃣ Print Pascal Triangle
    public static void printPascalTriangle(int rows) {

        System.out.println("Pascal Triangle:");

        for (int i = 0; i < rows; i++) {

            // spaces for pyramid shape
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + " ");
            }

            System.out.println();
        }
    }

    // 🔥 Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        printPascalTriangle(rows);

        sc.close();
    }
}