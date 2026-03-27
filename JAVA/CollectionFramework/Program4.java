package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class Program4 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80);
        set.add(90);
        set.add(null);
        System.out.println(set);

        String s1 = "ab";
        System.out.println(s1.hashCode());
        System.out.println(set.hashCode());
    }
}
