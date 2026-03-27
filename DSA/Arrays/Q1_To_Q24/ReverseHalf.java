package Q1_To_Q24;

import java.util.Arrays;

public class ReverseHalf {

    static void reverse(int[] a, int start, int end){
        while(start < end){
            int t = a[start];
            a[start] = a[end];
            a[end] = t;
            start++;    end--;
        }
    }
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70};
        int mid = a.length/2;
        reverse(a, 0, mid-1);
        reverse(a, mid, a.length-1);

        System.out.println(Arrays.toString(a));
    }
}
