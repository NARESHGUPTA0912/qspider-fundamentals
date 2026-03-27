package Paterns;

public class pattern215To227 {
    public static void pattern215(int n){
        for(int i=1; i<=n; i++){
            System.out.print(i*(i+1)+", ");
        }
    }

    public static void pattern216(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num*(num+1)+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern217(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.print(num*(num+1)+"\t");
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern218(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print(" \t");
            }
            for(int k=1; k<=i; k++){
                System.out.print(num*(num+1)+"\t");
                num++;
            }
            for(int x=1; x<=i; x++){
                if(x==1) continue;
                System.out.print(num*(num+1)+"\t");
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern219(int n) {
        int num = 1;  // starting number
        for(int i = 1; i <= n; i++) {

            // Print leading spaces (to center the triangle)
            for(int s = n - i; s >= 1; s--) {
                System.out.print("   "); // 3 spaces
            }

            // Print i numbers in the row
            for(int j = 1; j <= i; j++) {
                int val = num * (num + 1);
                System.out.printf("%-6d", val); // left-aligned with fixed width
                num++;
            }
            System.out.println();
        }
    }


    public static void pattern220(int n){
        int num = 2;
        for(int i=1; i<=n; i++){
            System.out.print(num+" ");
            num = (num*2) + 1 ;
        }
    }

    public static void pattern221(int n){
        int num = 3;
        for(int i=1; i<=n; i++){
            System.out.print(num+" ");
            num = (num*2) - 1 ;
        } 
    }

    public static void pattern222(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            System.out.print(num+" ");
            num = (num*num) + 1 ;
        }
    }

    public static void pattern223(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            if(i%2==1){
                System.out.print(num+" ");
                num = num + 1 ;
            } else {
                System.out.print(num+" ");
                num = num*3 ;
            }
        }
    }

    public static void pattern224(int n){
        int a = 0, b = 1;

        if(n >= 1) System.out.print(a);
        if(n >= 2) System.out.print(", " + b);

        for(int i = 3; i <= n; i++){
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }

    // Tribonacci series......
    public static void pattern225(int n){
        int a = 0, b = 1, c = 1;

        if(n >= 1) System.out.print(a);
        if(n >= 2) System.out.print(", " + b);
        if(n >= 3) System.out.print(", " + c);

        for(int i = 4; i <= n; i++){
            int d = a + b + c;
            System.out.print(", " + d);
            a = b;
            b = c;
            c = d;
        }
    }

    public static void pattern226(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            System.out.print(num + " ");
            num = (num * 2) + 1;
        }
    }

    // 1,3,7,13,21
    public static void pattern227(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            System.out.print(num + " ");
            num = num + (i * 2);
        }
    }


    public static void main(String[] args) {
        pattern217(5);
    }
}
