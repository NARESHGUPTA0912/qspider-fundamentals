package Java8Features.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMaps {
    public static void main(String[] args) {
        List<Integer> wipro = new ArrayList<>(Arrays.asList(1000,2000,3000));
        List<Integer> infosys = new ArrayList<>(Arrays.asList(10000,20000,30000));
        List<Integer> tcs = new ArrayList<>(Arrays.asList(100000,200000,300000));

        List<List<Integer>> ll = new ArrayList<>(Arrays.asList(wipro, infosys, tcs));
        System.out.println(ll);

        System.out.println("Groupes Salary: " + ll);
        ll.stream().flatMap(m -> m.stream().map(n -> n*2)).forEach(m -> System.out.println(m));
    }
}
