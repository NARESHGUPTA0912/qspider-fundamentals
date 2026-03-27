package Paterns;

public class pattern67_73_76 {
    
    public static void pattern67(int n){
        int space = n-1, star = 1;
        for(int i=1; i<=n; i++){
            // int num = star;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++){
                System.out.print("* ");
            }
            star+=2;
            space--;
            System.out.println();
        }
    }

    public static void pattern73(int n){
        int space = n-1, star =1;
        for(int i=1; i<=n; i++){
            int num = star;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++){
                System.out.print(num-- + " ");
            }
            star+=2;
            space--;
            System.out.println();
        }
    }

    public static void pattern76(int n){
        int space = n-1, star=1, num;
        for(int i=1; i<=n; i++){
            num =1;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }

            int colMid=(star/2)+1;
            for(int k=1; k<=star; k++){
                if(k<colMid){
                    System.out.print(num++ + " ");
                } else {
                    System.out.print(num-- + " ");
                }
            }
            star+=2;
            space--;
            System.out.println();
        }
    }

    // public static void pattern74(int n){
    //     int space = n-1, star =1;
    //     for(int i=1; i<=n; i++){
    //         int num = star;
    //         for(int j=1; j<=space; j++){
    //             System.out.print("  ");
    //         }
    //         for(int k=1; k<=star; k++){
    //             System.out.print(num-- + " ");
    //         }
    //         star+=2;
    //         space--;
    //         System.out.println();
    //     }
    // }


    public static void main(String[] args) {
        pattern67(5);
    }
}
