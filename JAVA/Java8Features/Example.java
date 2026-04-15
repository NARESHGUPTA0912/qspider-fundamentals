package Java8Features;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {

        Employee e1 = new Employee(12, "Ajit", 5000.00);
        Employee e2 = new Employee(21, "Naresh", 3000.89);
        Employee e3 = new Employee(04, "Prince", 4000.03);
        Employee e4 = new Employee(32, "Rohit", 2300.99);
        Employee e5 = new Employee(04, "Shivam", 676.90);

        Employee[] emp = {e1, e2, e3, e4, e5};
        System.out.println("Before sort: "+Arrays.toString(emp));
        Arrays.sort(emp);
        System.out.println("After sort: "+Arrays.toString(emp)); 
    }
}
