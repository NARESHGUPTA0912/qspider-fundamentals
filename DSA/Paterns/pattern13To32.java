package Paterns;

public class pattern13To32 {
    public static void solution13(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solution14(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solution15(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int k=n; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solution16(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int k=n; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solution17(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void solution18(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i%2 +" ");
            }
            System.out.println();
        }
    }

    public static void solution19(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    public static void solution20(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j%2 +" ");
            }
            System.out.println();
        }
    }

    public static void solution21(int n){
        int num = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num +" ");
            } num--;
            System.out.println();
        }
    }

    public static void solution22(int n){
        for(int i=1; i<=n; i++){
            int num = i;
            for(int j=1; j<=i; j++){
                System.out.print(num +" ");
                num--;
            } 
            System.out.println();
        }
    }

    public static void solution23(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("%d\t",num);
                num++;
            } 
            System.out.println();
        }
    }

    public static void solution24_1(int n){
        int num = n*(n+1)/2;
        for(int i=1; i<=n; i++){
            // int l =a+i;
            for(int j=i; j>=1;j--){
                System.out.printf("%d\t",num);
                num--;
            } 
            // a=a+i;
            System.out.println();
        }
    }
    public static void solution24_2(int n){
        int a = 0;
        for(int i=1; i<=n; i++){
            int l =a+i;
            for(int j=i; j>=1;j--){
                System.out.printf("%d\t",l);
                l--;
            } a=a+i;
            System.out.println();
        }
    }

    /* natural no => n*(n+1)/2 
        odd num sum => (n)^2
        even no sum => n*(n+1)
        odd no sequence (1,3,5,7,9) => 2*i-1
        even no sequence (2,4,6,8,10) => 2*i
    */ 

//    public static void solution25(int n){
        
//         for(int i=0; i<n; i++){
//             int a = n;
//             for(int j=0; j<=i;j++){
//                 System.out.printf("%d\t",a);
//                 a=a-(i+j);
//             }
//             // a=a-i;
//             System.out.println();
//         }
//     }

    public static void solution24(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("%d\t",num);
                num--;
            } num += 2*i+1; // odd no seq start at 3
            System.out.println();
        }
    }

    public static void solution25(int n){
        int num = n*(n+1)/2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("%d\t",num);
                num++;
            } num = num - (2*i+1); //
            System.out.println();
        }
    }


    public static void solution26(int n){
        int num = n*3;
        for(int i=1; i<=n; i++){
                
            for(int j=1; j<=i; j++){
                System.out.printf("%d\t",num);
                num--;
            } 
            System.out.println();
        }
    }

      public static void solution27(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("%c\t",ch);
                ch++;
            } 
            System.out.println();
        }
    }

      public static void solution27_2(int n){
        int num = 65;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char) (num++) + " ");
                // num++;
            } 
            System.out.println();
        }
    }

      public static void solution28(int n){
        char ch = 'O';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("%c\t",ch);
                ch--;
            } 
            System.out.println();
        }
    }


        public static void solution29(int n){
            char ch = 'A';
            for(char i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.printf("%c\t",ch);
                }
                System.out.println();
                ch++;
            }
        }

        public static void solution30(int n){
            for(int i=1; i<=n; i++){
                char ch = 'A';
                for(int j=1; j<=i; j++){
                    System.out.printf("%c\t",ch);
                    ch++;
                } 
                System.out.println();
            }
        }

        public static void solution31(int n){
            char ch = 'E';
            for(int i=1; i<=n; i++){
                
                for(int j=1; j<=i; j++){
                    System.out.printf("%c\t",ch);
                } 
                ch--;
                System.out.println();
            }
        }
        
        // public static void solution31_2(int n){
        //     for(int i=1; i<=n; i++){
        //         char ch = 'E';
        //         for(int j=1; j<=i; j++){
        //             System.out.printf("%c\t",ch);
        //             ch--;
        //         } 
        //         System.out.println();
        //     }
        // }

        public static void solution32(int n){
            // char star = 'A';
            for(int i=1; i<=n; i++){
                int num = 64+i;
                for(int j=1; j<=i; j++){
                    System.out.print((char) num-- + "\t"); 
                }num++;
                System.out.println();
            }
        }

    public static void main(String[] args) {
        solution24(5);
    }
}
