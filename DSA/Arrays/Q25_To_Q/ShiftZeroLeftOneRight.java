package Q25_To_Q;

public class ShiftZeroLeftOneRight {
    public static void main(String[] args) {
        int[] a = {0,1,1,0,1,0,0,1};

        int left = 0, right = a.length - 1;

        while (left < right) {

            while (left < right && a[left] == 0) {
                left++;
            }

            while (left < right && a[right] == 1) {
                right--;
            }

            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}

