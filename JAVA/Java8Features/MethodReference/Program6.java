package Java8Features.MethodReference;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

interface Obj{
    Demo val();
}

class Demo{
    void greet(){
        System.out.println("Hello Developers");
    }
}

public class Program6{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Obj m = Demo::new;
        Demo d = m.val();
        d.greet();

       Supplier<List> sf = LinkedList::new;
       List t=sf.get();

       Function<Integer, List<Integer> > f = ArrayList::new;
       List list = f.apply(10);
       System.out.println("List: " + list);

    }
}

