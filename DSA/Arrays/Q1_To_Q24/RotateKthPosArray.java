package Q1_To_Q24;

import java.util.*;

class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        int n = arr.length;

        k = k % n; // handle k > n
        int[] res = new int[n];

        int index = 0;

        // copy last k elements
        for (int i = n - k; i < n; i++) {
            res[index++] = arr[i];
        }

        // copy remaining elements
        for (int i = 0; i < n - k; i++) {
            res[index++] = arr[i];
        }

        System.out.println(Arrays.toString(res));
    }
}