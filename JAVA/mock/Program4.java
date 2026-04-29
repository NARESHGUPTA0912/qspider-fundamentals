package mock;
// wap to print a series of square root of number within 100 without using loop.

public class Program4 {
    public static void main(String[] args) {
        printSquareRoot(1);
    }

    public static void printSquareRoot(int num){
        if(num <= 100){
            System.out.println(Math.sqrt(num));
            printSquareRoot(num + 1);
        }
    }

    
}
