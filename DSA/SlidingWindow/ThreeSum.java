public class ThreeSum {
    public static void main(String[] args){
        int[] list = new int[]{1,2,3,9,5,6,7,4,9};
        System.out.println(maxSum(list));  // output: 24 (7+8+9)
    }

    public static int maxSum(int[] arr){
        int k = 3;
        int windowSum = 0;

        // Step 1: first window
        for(int i = 0; i < k; i++){
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: slide window
        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}