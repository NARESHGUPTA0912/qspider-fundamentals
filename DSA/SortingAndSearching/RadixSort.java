import java.util.Arrays;

public class RadixSort {

    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        // process each digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    public static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // digits 0–9

        // count occurrences
        for (int num : arr) {
            int digit = (num / exp) % 10;
            count[digit]++;
        }

        // prefix sum
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // build output (right to left for stability)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // copy back
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}