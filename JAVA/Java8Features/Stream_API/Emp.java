package Java8Features.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employees {
    int id;
    String name;

    public Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Id: "+id+" Name: " + name;
    }
}

public class Emp{
    public static void main(String[] args) {
        
        List<Employees> list = new ArrayList<>(Arrays.asList(new Employees(12, "Kavita"), new Employees(21, "Kamal"),new Employees(17, "Raj"), new Employees(19, "Maanik")));

        List<Integer> l = list.stream().map(m->m.id).collect(Collectors.toList());
        System.out.println(l);
        // System.out.println(list.stream().map(m->m.id).collect(Collectors.toList()));

        Map<Integer, String> map = list.stream().collect(Collectors.toMap(m->m.id, m->m.name));
        System.out.println(map);
        // System.out.println(list.stream().collect(Collectors.toMap(m->m.id, m->m.name)));

        Set<Employees> set = list.stream().filter((e) -> e.name.startsWith("K") || e.name.endsWith("k")).collect(Collectors.toSet());
        System.out.println(set);
    }
}
