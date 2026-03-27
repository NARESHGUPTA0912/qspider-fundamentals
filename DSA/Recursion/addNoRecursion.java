package Recursion;

public class addNoRecursion {
    
    public static int add(int a, int b){
        return a+b;    
    }

    public static void main(String[] args) {
        int sum = add(7,3);
        System.out.println("Sum is: "+sum);
        int x=12, y=30, p=10, q=20;
        int sum2 = add(add(x,y),add(p,q));  // Recursion by calling method from method :
        System.out.println("Sum is: "+sum2);
    }
}
