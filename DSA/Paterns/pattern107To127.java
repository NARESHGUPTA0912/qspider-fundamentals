package Paterns;

public class pattern107To127 {

    public static void pattern107(int n) {
        int star = 2 * n - 1;   // top row stars
        int space = 0;         // start with 0 leading spaces
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int k = 1; k <= star; k++)
                System.out.print("* ");
            System.out.println();
            space += 1;   star -= 2;
        }
    }

    public static void pattern108(int n) {
        int star = 2 * n - 1;   // top row stars
        int space = 0;         // start with 0 leading spaces
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int k = 1; k <= star; k++)
                System.out.print(i + " ");
            System.out.println();
            space += 1;   star -= 2;
        }
    }

    public static void pattern109(int n) {
        int star = 2 * n - 1;   // top row stars
        int space = 0;         // start with 0 leading spaces
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int k = 1; k <= star; k++)
                System.out.print(i%2 + " ");
            System.out.println();
            space += 1;   star -= 2;
        }
    }

    public static void pattern110(int n) {
        int star = 2 * n - 1;   // top row stars
        int space = 0;         // start with 0 leading spaces
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int k = 1; k <= star; k++)
                System.out.print(k + " ");
            System.out.println();
            space += 1;   star -= 2;
        }
    }

    public static void pattern111(int n) {
        int star = 2 * n - 1;   // top row stars
        int space = 0;         // start with 0 leading spaces
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int k = 1; k <= star; k++)
                System.out.print(k%2 + " ");
            System.out.println();
            space += 1;   star -= 2;
        }
    }

    public static void pattern112(int n) {
        int star = 2 * n - 1;   // top row stars
        int space = 0;  int num=1;     // start with 0 leading spaces
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("    ");
            for (int k = 1; k <= star; k++)
                System.out.printf("%-4d",num++);
            System.out.println();
            space += 1;   star -= 2;
        }
    }

    public static void pattern113(int n) {
        int star = 2 * n - 1;   // top row stars
        int space = 0;  int num=n*n;       // start with 0 leading spaces
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("    ");
            for (int k = 1; k <= star; k++)
                System.out.printf("%-4d",num--);
            System.out.println();
            space += 1;   star -= 2;
        }
    }

    public static void pattern114(int n) {
        int star = 2 * n - 1;   // top row stars
        int space = 0;  int num=n;       // start with 0 leading spaces
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("    ");
            for (int k = 1; k <= star; k++)
                System.out.printf("%-4d",num);
            num--;
            System.out.println();
            space += 1;   star -= 2;
        }
    }

    public static void pattern115(int n){
        int start = 2 * n - 1;   // for n=5 → 9
        for(int i = 0; i < n; i++){
            for(int s = 0; s < i; s++)
                System.out.print("   ");
            for(int j = start - 2*i; j >= 1; j--)
                System.out.print(j + "  ");
            System.out.println();
        }
    }

    public static void pattern115_2(int n){
        for(int i = 0; i < n; i++){
            System.out.print("   ".repeat(i));
            for(int j = 2*(n-i)-1; j >= 1; j--)
                System.out.print(j + "  ");
            System.out.println();
        }
    }


    /*  1 2 3 4 5 4 3 2 1
          1 2 3 4 3 2 1
            1 2 3 2 1
              1 2 1
                1
     */

    public static void pattern116(int n){
        for(int i = 0; i < n; i++){
            for(int s = 0; s < i; s++)
                System.out.print("  ");
            int limit = n - i;
            for(int j = 1; j <= limit; j++)
                System.out.print(j + " ");
            for(int j = limit - 1; j >= 1; j--)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void pattern116_2(int n) {
        for (int i = 0; i < n; i++) {
            int limit = n - i;
            System.out.print("  ".repeat(i));
            for (int j = 1; j < limit * 2; j++) {     // Increasing + decreasing part in one loop
                int num = j <= limit ? j : (limit * 2 - j);
                System.out.print(num + " ");
            } System.out.println();
        }
    }

    public static void pattern117(int n) {
        for (int i = 1; i <= n; i++) {
            int start = i;    // row starting number
            int mid   = n;    // middle highest number (always n)
            // 1st inner loop → print spaces
            for (int s = 1; s < i; s++)
                System.out.print("  ");
            // 2nd inner loop → increasing then decreasing numbers
            for (int j = start; j <= mid; j++)        // increasing part
                System.out.print(j + " ");
            for (int j = mid - 1; j >= start; j--)    // decreasing part
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void pattern117_2(int n) {
        for (int i = 1; i <= n; i++) {
            int start = i;      // starting number in that row
            int mid   = n;      // highest number in that row
            // 1st inner loop → leading spaces
            for (int s = 1; s < i; s++)
                System.out.print("  ");
            // 2nd inner loop → print numbers increasing & then decreasing
            for (int j = start; j <= mid * 2 - start; j++) {
                int num = j <= mid ? j : (mid * 2 - j);
                System.out.print(num + " ");
            } System.out.println();
        }
    }

    /*
    4   3   2   1   0   1   2   3   4
        3   2   1   0   1   2   3
            2   1   0   1   2
                1   0   1
                    0
     */
    public static void pattern118(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s < i; s++)
                System.out.print("  ");
            int limit = n - i;
            for (int j = limit; j >= 0; j--)
                System.out.print(j + " ");
            for (int j = 1; j <= limit; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    /*
    5   4   3   2   1   2   3   4   5
        4   3   2   1   2   3   4
            3   2   1   2   3
                2   1   2
                    1
     */
    public static void pattern119(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s < i; s++)
                System.out.print("  ");
            int limit = n - i + 1;
            for (int j = limit; j >= 1; j--)
                System.out.print(j + " ");
            for (int j = 2; j <= limit; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void pattern120(int n) {
        int star = 2 * n - 1;   // top row stars
        int space = 0; char ch = 'A';        // start with 0 leading spaces
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int k = 1; k <= star; k++)
                System.out.print(ch + " ");
            System.out.println();
            space += 1;   star -= 2;
            ch++;
        }
    }
    
    public static void pattern121(int n) {
        int star = 2 * n - 1;   // top row stars
        int space = 0;        // start with 0 leading spaces
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int k = 1; k <= star; k++)
                System.out.print(ch++ + " ");
            System.out.println();
            space += 1;   star -= 2;
        }
    }
    
    public static void pattern122(int n) {
        int star = 2 * n - 1;   // top row stars
        int space = 0;        // start with 0 leading spaces
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int k = 1; k <= star; k++)
                System.out.print(ch++ + " ");
            System.out.println();
            space += 1;   star -= 2;
        }
    }
    
    public static void pattern123(int n) {
        int star = 2 * n - 1;   // top row stars
        int space = 0;        // start with 0 leading spaces
        char ch = 'Y';
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int k = 1; k <= star; k++)
                System.out.print(ch-- + " ");
            System.out.println();
            space += 1;   star -= 2;
        }
    }
    
    public static void pattern124(int n) {
        int star = 2 * n - 1;   // top row stars
        int space = 0;        // start with 0 leading spaces
        char ch = (char) (64 + n);
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int k = 1; k <= star; k++)
                System.out.print(ch + " ");
            ch--;
            System.out.println();
            space += 1;   star -= 2;
        }
    }

    // public static void pattern125(int n) {
    //     int star = 2 * n - 1;   // top row stars
    //     int space = 0;        // start with 0 leading spaces
    //     for (int i = 1; i <= n; i++) {
    //         char ch = (char) (64 + (2*n - i));
    //         for (int s = 1; s <= space; s++)
    //             System.out.print("  ");
    //         for (int k = 1; k <= star; k++)
    //             System.out.print(ch + " ");
    //         // ch--;
    //         System.out.println();
    //         space += 1;   star -= 2;
    //     }
    // }

    /*
    I H G F E D C B A
      G F E D C B A
        E D C B A
          C B A
            A
     */

    public static void pattern125(int n){
        char start = (char) (64 + (2 * n - 1));   // for n=5 → 'I'
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++)
                System.out.print("  ");
            char rowStart = (char) (start - 2 * i);
            for (char ch = rowStart; ch >= 'A'; ch--)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    /*
    E D C B A B C D E
      D C B A B C D
        C B A B C
          B A B
            A
     */

    public static void pattern126(int n){
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++)
                System.out.print("  ");
            char rowStart = (char) ('A' + (n - 1 - i));
            for (char ch = rowStart; ch >= 'A'; ch--)
                System.out.print(ch + " ");
            for (char ch = 'B'; ch <= rowStart; ch++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    /*
    A B C D E D C B A
      A B C D C B A
        A B C B A
          A B A
            A
     */

    public static void pattern127(int n){
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++)
                System.out.print("  ");
            int limit = n - i;
            // Increasing part
            for (char ch = 'A'; ch < 'A' + limit; ch++)
                System.out.print(ch + " ");
            // Decreasing part
            for (char ch = (char)('A' + limit - 2); ch >= 'A'; ch--)
                System.out.print(ch + " ");
            System.out.println();
        }
    }



    public static void main(String[] args) {
        pattern127(5);
    }
}
