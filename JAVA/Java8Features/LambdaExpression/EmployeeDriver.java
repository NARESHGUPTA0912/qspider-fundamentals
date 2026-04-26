package Java8Features.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Prince", 38000);
        Employee e2 = new Employee(2, "Rohit", 20000);
        Employee e3 = new Employee(3, "Shobhit", 300000);
        Employee e4 = new Employee(4, "Rahul", 29000);
        Employee e5 = new Employee(5, "Sunny", 70000);
        // Employee e6 = new Employee(6, "Ginny", 90000);


        List<Employee> l =new ArrayList<>();
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
        l.add(e5);
        System.out.println("Before Remove");
        l.forEach((m) -> System.out.println(m.name));
        l.removeIf((emp) -> emp.salary > 50000);
        System.out.println("After Remove");
        l.forEach((m) -> System.out.println(m.name));
    }
}
