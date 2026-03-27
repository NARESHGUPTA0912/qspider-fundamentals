public class loopDemo {
    public static void main(String[] args){

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println("\n\n");

         for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++)
                System.out.print("* ");
            System.out.println();
        }

        for(int i=1; i<=5; i++){
            for(int j=5; j>1; j--){
                System.out.println(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
