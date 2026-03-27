package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

class Program1{
    public static void main(String[] args) {
        int[] a = {12,3,2,1,2,1};

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(12);
        a1.add(22);
        a1.add(32);
        a1.add(42);
        a1.add(122);
        a1.add(121);
        a1.add(12);
        System.out.println(a1);
        System.out.println(Arrays.toString(a));
    }
}