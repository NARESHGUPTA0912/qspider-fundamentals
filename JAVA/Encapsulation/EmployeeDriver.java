package Encapsulation;

public class EmployeeDriver {
    public static void main(String[] args) {
        
        EmployeeDetails e = new EmployeeDetails();
        e.setAge(24);
        e.setName("Prince Gupta");
        e.setSalary(12345.6);
        System.out.println();
        System.out.println("Name is: "+e.getName());
        System.out.println("Age is: "+e.getAge());
        System.out.println("Salary is: "+e.getSalary());
        
    }
}