package Q1_To_Q24;

public class RotateLeftByOne {
    public static void rotateLeftByOne(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
    }
}