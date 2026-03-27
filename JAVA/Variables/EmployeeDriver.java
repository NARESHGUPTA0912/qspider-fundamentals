class Employee {
    // static variable
    static String companyName = "Qspider Testing & Software Solutions";

    // instance variables
    int empId;
    String name;
    double salary;

    // method to set employee data aka Mutator method
    public void setEmployeeData(int empId, String name, double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // method to display employee data aka Accessor method
    public void getEmployeeData() {
        String department = "IT";  // local variable
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("----------------------------------");
    }
}

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.setEmployeeData(101, "Naresh Gupta", 45000.0);
        emp2.setEmployeeData(102, "Aditi Sharma", 36000.0);
        emp1.getEmployeeData();     emp2.getEmployeeData();
        
    }
}
