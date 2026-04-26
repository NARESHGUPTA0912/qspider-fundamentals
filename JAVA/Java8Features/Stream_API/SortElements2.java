package Java8Features.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortElements2 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(5,3,2,6,7,823,4,55,6,76,55,3));
        // way-1
        l.stream().sorted(Comparator.reverseOrder()).forEach((m)-> System.out.print(m + " "));
        // way-2
        System.out.println();
        l.stream().sorted((a,b)->b-a).forEach((m)->System.out.print(m + " "));
    }
}
