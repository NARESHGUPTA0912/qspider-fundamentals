package Recursion;

public class biggestNoRecursion {

    public static int big(int a, int b){
        return a>b?a:b;
    }
    public static void main(String[] args) {
        int x=12, y=15, p=50, q=19, r=36;
        int big = big(big(big(p,q),r),big(x,y));    //Recursion by calling method from method :
        System.out.println("Biggest is: "+big);
    }
}
