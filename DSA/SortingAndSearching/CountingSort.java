import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        int[] count = new int[max + 1];

        // Step 1: Count frequency
        for (int num : arr) {
            count[num]++;
        }

        // Step 2: Prefix sum
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Build output array
        int[] output = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy back
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        countingSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}