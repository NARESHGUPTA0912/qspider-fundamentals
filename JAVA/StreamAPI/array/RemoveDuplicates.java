package StreamAPI.array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {9, 7, 1, 4, 2, 3, 2, 5, 3, 1, 5};
         arr = Arrays.stream(arr).distinct().toArray();
         // Update the original array reference to the new array with duplicates removed.
        System.out.println("Array with duplicates removed:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        System.out.println("\nSorted array:"+Arrays.toString(sortedArr));
    }
}   