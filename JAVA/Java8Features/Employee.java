package Java8Features;

class Employee implements Comparable<Employee>{
    Integer id ;
    String name;
    Double salary;


    Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Name: " + name + "id: " + id + "Salary: " + salary;
    }

    @Override
    public int compareTo(Employee e){
        return this.name.compareTo(name);               // currentObj - passedObj
    }
}