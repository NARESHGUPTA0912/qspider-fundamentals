package StreamAPI;

import java.util.Arrays;

public class Program1{
    public static void main(String[] args) {
        int[] a = {12, 22, 33, 56, 88, 11};
        Arrays.stream(a).filter(n -> n%2==0).forEach(n->System.out.print(n + " "));
        System.out.println();
        Arrays.stream(a).forEach(n -> System.out.print(n + " "));
    }
}