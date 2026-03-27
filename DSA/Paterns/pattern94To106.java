package Paterns;

public class pattern94To106 {

    public static void pattern94(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)    // leading spaces
                System.out.print("  ");
            for (int k = 1; k <= i; k++)    // stars in each row
                System.out.print(" *  ");
            System.out.println();
        }
    }

    public static void pattern95(int n) {
        int num = 1;
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)    // leading spaces
                System.out.print("  ");
            for (int k = 1; k <= i; k++)    // stars in each row
                System.out.printf(" %d  ",num);
            num++;
            System.out.println();
        }
    }

    public static void pattern96(int n) {
        int num=1;
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)    // leading spaces
                System.out.print("  ");
            for (int k = 1; k <= i; k++)    // stars in each row
                System.out.printf(" %d  ",num%2);
            num++;
            System.out.println();
        }
    }

    public static void pattern97(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)    // leading spaces
                System.out.print("  ");
            for (int k = 1; k <= i; k++)    // stars in each row
                System.out.printf(" %d  ",k);
            System.out.println();
        }
    }

    public static void pattern98(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)    // leading spaces
                System.out.print("  ");
            for (int k = 1; k <= i; k++)    // stars in each row
                System.out.printf(" %d  ",k%2);
            System.out.println();
        }
    }

    public static void pattern99(int n) {
        int num = 1;
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)    // leading spaces
                System.out.printf("    ");
            for (int k = 1; k <= i; k++)    // stars in each row
                System.out.printf("%-4d    ",num++);
            System.out.println();
        }
    }

    public static void pattern100(int n) {
        int num = n*(n+1)/2;
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)    // leading spaces
                System.out.printf("    ");
            for (int k = 1; k <= i; k++)    // stars in each row
                System.out.printf("%-4d    ",num--);
            System.out.println();
        }
    }

    public static void pattern101(int n) {
        char alp = (char) (65);
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)    // leading spaces
                System.out.printf("    ");
            for (int k = 1; k <= i; k++)    // stars in each row
                System.out.printf("%-4c    ",alp);
            alp++;
            System.out.println();
        }
    }

    public static void pattern102(int n) {
        for (int i = n; i >= 1; i--) {
            char alp = (char) (65);
            for (int s = 1; s <= n - i; s++)    // leading spaces
                System.out.printf("    ");
            for (int k = 1; k <= i; k++)    // stars in each row
                System.out.printf("%-4c    ",alp++);
            System.out.println();
        }
    }

    public static void pattern103(int n) {
        char alp = (char) (65);
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)    // leading spaces
                System.out.printf("    ");
            for (int k = 1; k <= i; k++)    // stars in each row
                System.out.printf("%-4c    ",alp++);
            System.out.println();
        }
    }

    public static void pattern104(int n) {
        char alp = (char) (64+n);
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)    // leading spaces
                System.out.printf("    ");
            for (int k = 1; k <= i; k++)    // stars in each row
                System.out.printf("%-4c    ",alp--);
            System.out.println();
        }
    }

    public static void pattern105(int n) {
        char alp = (char) (64+n);
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)    // leading spaces
                System.out.printf("    ");
            for (int k = 1; k <= i; k++)    // stars in each row
                System.out.printf("%-4c    ",alp);
            alp--;
            System.out.println();
        }
    }

    public static void pattern106(int n) {
        int x = 1;
        for (int i = n; i >= 1; i--) {
            char alp = (char) (64+n - x + 1);
            for (int s = 1; s <= n - i; s++)    // leading spaces
                System.out.printf("    ");
            for (int k = 1; k <= i; k++)    // stars in each row
                System.out.printf("%-4c    ",alp--);
            x++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern106(5);
    }
}
