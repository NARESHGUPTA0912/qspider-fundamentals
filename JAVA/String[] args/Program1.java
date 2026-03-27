import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        int x = 35;
        System.out.println(x);

        int[] a = {12, 10, 18, 15, 25};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a.length-1);
        System.out.println(a[a.length]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
    }
}
