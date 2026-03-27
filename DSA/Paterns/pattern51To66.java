package Paterns;

public class pattern51To66 {
    public static void pattern51(int no){
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("  * ");
            }
            System.out.println();
        }
    }

    public static void pattern52(int no){
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("  "+i+" ");
            }
            System.out.println();
        }
    }

    public static void pattern53(int no){
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("  "+(i%2)+" ");
            }
            System.out.println();
        }
    }

    public static void pattern54(int no){
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("  "+(k)+" ");
            }
            System.out.println();
        }
    }

    public static void pattern55(int no){
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("  "+(k%2)+" ");
            }
            System.out.println();
        }
    }

    public static void pattern56(int no){
        int num = 1;
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%-3d ", num);
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern57(int no){
        int num = no*(no+1)/2;
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%-3d ", num);
                num--;
            }
            System.out.println();
        }
    }

    public static void pattern58(int no){
        for(int i=1; i<=no; i++){
            int num = i;
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%-3d ", num);
                num--;
            }
            System.out.println();
        }
    }

    public static void pattern59(int no){
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            int num = no;
            for(int k=1; k<=i; k++){
                System.out.printf("%-3d ", num);
                num--;
            }
            System.out.println();
        }
    }
    
    public static void pattern60(int no){
        int num = no;
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%-3d ", num);
            }
            num--;
            System.out.println();
        }
    }

    public static void pattern61(int no){
        char ch = (char) 65;
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%-3c ", ch);
            }
            ch++;
            System.out.println();
        }
    }

    public static void pattern62(int no){
        for(int i=1; i<=no; i++){
            char ch = (char) 65;
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%-3c ", ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void pattern63(int no){
        char ch = (char) (64 + no);
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%-3c ", ch);
            }
            ch--;
            System.out.println();
        }
    }
    public static void pattern64(int no){
        for(int i=1; i<=no; i++){
            char ch = (char) (64 + i);
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%-3c ", ch);
                ch--;
            }
            System.out.println();
        }
    }

    public static void pattern65(int no){
        char ch = (char) 65;
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%-3c ", ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern66(int no){
        char ch = (char) (64 + (no*(no+1)/2));
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("%-3c ", ch);
                ch--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern51(5);
    }
}
