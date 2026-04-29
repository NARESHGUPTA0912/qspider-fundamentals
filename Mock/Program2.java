package mock;

public class Program2 {
    public static void main(String[] args) {
        // program to check even or odd number
        int num = 12;

        switch(num%2){
            case 0 -> System.out.println("Number is even");
            
            case 1 -> System.out.println("Number is odd");

            default -> System.out.println("Wrong Input" );
        }
    }
}
