package Java8Features.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LimitSortElements {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(5,3,2,6,7,823,4,55,6,76,55,3));
        System.out.println(l);
        // limit way-1
        l.stream().sorted(Comparator.reverseOrder()).limit(4).forEach((m)-> System.out.print(m + " "));
        // limit way-2
        System.out.println();
        l.stream().limit(4).sorted((a,b)->b-a).forEach((m)->System.out.print(m + " "));

        // skip-1
        l.stream().skip(4).sorted((a,b)->b-a).forEach((m)->System.out.print(m + " "));
    }
}
