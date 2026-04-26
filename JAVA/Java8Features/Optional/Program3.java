package Java8Features.Optional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Program3 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(null);     set.add(8);
        set.add(98);    set.add(98);
        set.add(11);    set.add(26);

        Optional<Integer> num = set.stream().filter((m)-> m%2==0 && m>=10 && m<=99).findFirst();

        if(num.isPresent()){
            System.out.println("First Even Number with two digits: " + num.get());
        } else {
            System.out.println("No Such Element Present");
        }
    }
}
