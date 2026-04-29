import java.util.*;

public class BucketSort {

    public static void bucketSort(float[] arr) {
        int n = arr.length;

        // Step 1: Create buckets
        List<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Step 2: Put elements into buckets
        for (float num : arr) {
            int index = (int)(num * n); // for range [0,1)
            buckets[index].add(num);
        }

        // Step 3: Sort each bucket
        for (List<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Step 4: Merge buckets
        int k = 0;
        for (List<Float> bucket : buckets) {
            for (float num : bucket) {
                arr[k++] = num;
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.42f, 0.32f, 0.23f, 0.52f, 0.25f, 0.47f};

        bucketSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}