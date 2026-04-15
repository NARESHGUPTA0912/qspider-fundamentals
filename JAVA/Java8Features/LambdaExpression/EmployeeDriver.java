package Java8Features.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Prince", 1000);
        Employee e2 = new Employee(2, "Rohit", 2000);
        Employee e3 = new Employee(3, "Shobhit", 3000);
        Employee e4 = new Employee(4, "Rahul", 1400);
        Employee e5 = new Employee(5, "Sunny", 7000);


        List<Employee> l =new ArrayList<>();
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
        l.add(e5);
        l.forEach((m) -> System.out.println(m.name));
    }
}
