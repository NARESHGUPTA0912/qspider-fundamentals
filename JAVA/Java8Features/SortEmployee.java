package Java8Features;

import java.util.*;

public class SortEmployee {
    String name;
    int id;
    double sal;

    SortEmployee(String name, int id, double sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return name + " " + id + " " + sal;
    }

    public static void main(String[] args) {
        List<SortEmployee> list = Arrays.asList(
            new SortEmployee("Prince", 5, 12000), 
            new SortEmployee("Rahul", 3, 6000), 
            new SortEmployee("Ansh", 1, 10000),
            new SortEmployee("Shivam", 2, 2000),
            new SortEmployee("Ravi", 4, 14000)
        );

        // Descending order based on id
        TreeSet<SortEmployee> ts = new TreeSet<>(
            (s1, s2) -> s2.id - s1.id
        );

        // Ascending order based on name
        TreeSet<SortEmployee> ts1 = new TreeSet<>((s1, s2) -> s1.name.compareTo(s2.name));

        ts.addAll(list);
        ts1.addAll(list);

        ts.forEach(System.out::println);
        ts1.forEach((s) -> System.out.println(s));
    }
}