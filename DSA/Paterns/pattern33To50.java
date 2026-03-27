package Paterns;

public class pattern33To50 {

    /*
     * Pattern 33
     *      1
     *    2 2
     *  3 3 3
     *  4 4 4 4
     *5 5 5 5 5 
     */
    
    public static void pattern33(int n){
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void pattern34(int n){
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(i%2 + " ");
            }
            System.out.println();
        }
    }
    public static void pattern35(int n){
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    public static void pattern36(int n){
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k%2 + " ");
            }
            System.out.println();
        }
    }
    public static void pattern37(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%d \t", num);
                num++;
            }
            System.out.println();
        }
    }
    public static void pattern38(int n){
        int num = n*(n+1)/2;
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%d \t", num);
                num--;
            }
            // num -= 2*i;
            System.out.println();
        }
    }
    public static void pattern39(int n){
        int num = n;
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%d \t", num);
            }
            num--;
            System.out.println();
        }
    }
    public static void pattern40(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%d \t", num--);
            }
            num = i + 1;
            System.out.println();
        }
    }
    public static void pattern41(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%d \t", num--);
            }
            num += 2*i+1 ;
            System.out.println();
        }
    }
    public static void pattern42(int n){
        int num = n*(n+1)/2;
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%d \t", num++);
            }
            num -= 2*i+1 ;
            System.out.println();
        }
    }
    public static void pattern43(int n){
        // char ch = 'A';
        char ch = 65;
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.print((char)ch + " \t");
            }
            ch++;
            System.out.println();
        }
    }
    public static void pattern44(int n){
        // char ch = 'A';
        for(int i=1; i<=n; i++){
            char ch = 65;
            for(int j = n - i; j >= 1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.print((char)ch + " \t");
                ch++;
            }
            System.out.println();
        }
    }
    public static void pattern45(int n){
        // char ch = 'A';
        char ch = 65;
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.print((char)ch + " \t");
                ch++;
            }
            System.out.println();
        }
    }
    public static void pattern46(int n){
        // char ch = 'A';
        char ch = (char) (64 + (n*(n+1)/2));
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.print((char)ch + " \t");
                ch--;
            }
            System.out.println();
        }
    }
    public static void pattern47(int n){
        // char ch = 'A';
        char ch = (char) (64 + n);
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.print((char)ch + " \t");
            }
            ch--;
            System.out.println();
        }
    }
    public static void pattern48(int n){
        // char ch = 'A';
        char ch = 65;
        for(int i=1; i<=n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.print((char)ch-- + " \t");
            }
            ch = (char) (65 + i);
            System.out.println();
        }
    }

    public static void pattern49(int n){
        char ch = (char)65;   // start from first letter

        for(int i = 1; i <= n; i++){
            // leading spaces
            for(int s = 0; s < n - i; s++)
                System.out.print("    ");
            // print letters
            for(int j = 1; j <= i; j++)
                System.out.printf("%-4c", ch--);
            System.out.println();
            ch += 2*i+1 ;
        } 
    }
    public static void pattern50(int n){
        int total = n * (n + 1) / 2;
        char ch = (char)(65 + total - 1);   // start from last letter

        for(int i = 1; i <= n; i++){
            // leading spaces
            for(int s = 0; s < n - i; s++)
                System.out.print("    ");
            // print letters
            for(int j = 1; j <= i; j++)
                System.out.printf("%-4c", ch++);
            System.out.println();
            ch -= 2*i+1 ;
        } 
    }

    public static void main(String[] args) {
        pattern49(5);
    }
}

