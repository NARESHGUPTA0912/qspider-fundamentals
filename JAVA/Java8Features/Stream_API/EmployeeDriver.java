package Java8Features.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Ginny", 80000);
        Employee e1 = new Employee(2, "Prince", 40000);
        Employee e2 = new Employee(3, "Rohit", 30000);
        Employee e3 = new Employee(4, "Shobhit", 30000);
        Employee e4 = new Employee(5, "Rahul", 70000);
        Employee e5 = new Employee(6, "Sunny", 70000);
        Employee e6 = new Employee(7, "Ginny", 90000);
        Employee e7 = new Employee(8, "Nanny", 70000);
        Employee e8 = new Employee(9, "Giyu", 90000);
        Employee e9 = new Employee(10, "Jimmy", 90000);


        List<Employee> l =new ArrayList<>(
            Arrays.asList(e, e1, e2, e3, e4, e5, e6, e7, e8, e9)
        );
        System.out.println(l.stream().distinct().count());
        // System.out.println(dis);
    }
}
