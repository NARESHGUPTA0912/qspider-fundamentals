package Java8Features.Stream_API;

public class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Id: " + id + "Name: " + name + "Salary: " + salary;
    }
    @Override
    public boolean equals(Object o){
        Employee e = (Employee)o;
        return this.salary == e.salary;
    }
    @Override
    public int hashCode() {
        // return Integer.hashCode(id) + Double.hashCode(salary) + name.hashCode();
        return Double.hashCode(salary);
    }
}
