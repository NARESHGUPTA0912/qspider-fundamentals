package Java8Features.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TelevisionsDriver {
    public static void main(String[] args) {

        Televisions t = new Televisions(1, "Blue", 50000);
        Televisions t1 = new Televisions(2, "Black", 70000);
        Televisions t2 = new Televisions(3, "Blue", 50000);
        Televisions t5 = new Televisions(4, "Grey", 100000);
        Televisions t7 = new Televisions(5, "Blue", 60000);
        Televisions t8 = new Televisions(6, "Grey", 80000);
        Televisions t9 = new Televisions(7, "Blue", 80000);
        Televisions t6 = new Televisions(8, "Grey", 80000);
        Televisions t4= new Televisions(9, "Blue", 100000);
        Televisions t3 = new Televisions(10, "Black", 100000);

        List<Televisions> list = new ArrayList<>(Arrays.asList(t, t1, t2, t3, t4, t5, t6, t7, t8, t9));
        // System.out.println(list);
        list.stream().sorted().limit(2).forEach((e)->System.out.println(e));
    }
}
