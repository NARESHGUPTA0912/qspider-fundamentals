package Java8Features;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class SortElements implements Comparator<Integer> {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(Arrays.asList(10, 3, 40, 26, 19, 10, 2, 7));
        TreeSet<Integer> t2 = new TreeSet<>(new SortElements());
        t2.addAll(t);
        System.out.println("Sorted Elements in descending order: " + t2);
    }

    @Override
    public int compare(Integer i1, Integer i2){
        return i2-i1;
    }
}