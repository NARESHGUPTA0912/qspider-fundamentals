package Java8Features.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(
            Arrays.asList(1,1,2,2,3,3,4,4,4,4,3,3,3,2,6,7,8,9,8,7,6));
            long n = l.stream().distinct().count();
            System.out.println(n);
    }
}