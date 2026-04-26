package Java8Features.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductOfNaturalNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int product = list.stream().reduce(1, (i,j) -> i*j);
        System.out.println(product);

        List<Character> l1 = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        System.out.println("Array before Changes to UpperCase: " + l1);
        List<Character> l2 = l1.stream().map((m) -> (char)(m - 32)).collect(Collectors.toList());
        System.out.println("Array after Changes to UpperCase: " + l2);
        List<Character> l3 = l1.stream().map((m) -> Character.toUpperCase(m)).collect(Collectors.toList());
        
        List<List<Character>> lists = new ArrayList<>(Arrays.asList(l1, l2, l3));
        lists.stream().flatMap((m) -> m.stream().forEach(System.out.println(m)));
    }
}
