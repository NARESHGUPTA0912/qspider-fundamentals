package Q25_To_Q;

public class CompareArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};

        boolean isSame = true;

        if (a.length != b.length) {
            isSame = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    isSame = false;
                    break;
                }
            }
        }

        System.out.println(isSame);
    }
}
