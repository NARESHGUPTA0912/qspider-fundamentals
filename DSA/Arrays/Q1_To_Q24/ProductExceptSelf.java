package Q1_To_Q24;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] a= {1,7,3,4,5};
        int product = 1;
        for(int x: a)
            product *= x;
        for(int i=0; i<a.length; i++)
            System.out.println(product/a[i] + " ");
    }
}
