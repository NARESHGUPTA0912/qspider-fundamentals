package Q1_To_Q24;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,40,50,60};
        System.out.println("Before Reversing: "+Arrays.toString(a));
        int i=0, j=a.length-1;
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;    j--;
        }System.out.println("After Reversing: "+Arrays.toString(a));
    }
}
