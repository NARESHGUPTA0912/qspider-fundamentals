package StreamAPI.array;

import java.util.Arrays;
import java.util.Comparator;

public class SecondMax {
    public static void main(String[] args) {
        int[] a = {76,100,78,23,71,9,23};
        System.out.println(secongMax(a));
        
    }

    public static int secongMax(int[] s){
        return Arrays.stream(s).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
    }
}