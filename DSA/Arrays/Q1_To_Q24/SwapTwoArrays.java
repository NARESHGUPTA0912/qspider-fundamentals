package Q1_To_Q24;

import java.util.Arrays;

public class SwapTwoArrays {
    
    private static void swapArrays(int[] a, int[] b) {
        int []temp = a;
        a = b;  b = temp;
        System.out.println("Arrays after Swapping.");
        System.out.println("Array a: "+ Arrays.toString(a));
        System.out.println("Array b: "+ Arrays.toString(b));
    }

    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b = {50,60,70,80,90};
        System.out.println("Arrays Before Swapping.");
        System.out.println("Array a: "+ Arrays.toString(a));
        System.out.println("Array b: "+ Arrays.toString(b));
        swapArrays(a,b);
    }

}
