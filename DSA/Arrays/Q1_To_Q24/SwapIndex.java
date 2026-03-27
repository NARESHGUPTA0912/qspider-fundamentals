package Q1_To_Q24;

import java.util.Arrays;

public class SwapIndex {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60};
        System.out.println("Before Swapping Index: "+Arrays.toString(a));
        int i=1,j=5; //swap 20 and 60
        int temp = a[i];
        a[i] = a[j]; 
        a[j] = temp;
        System.out.println("After Swapping Index: "+Arrays.toString(a));
    }
}
