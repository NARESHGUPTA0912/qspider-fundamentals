package Java8Features.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortElements {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(5,3,2,6,7,823,4,55,6,76,55,3));
        l.stream().sorted().forEach((m)-> System.out.println(m));
    }
}
