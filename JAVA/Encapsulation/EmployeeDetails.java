package Encapsulation;

class EmployeeDetails {
    private int age;
    private double salary;
    private String name;

    public void setAge(int age){
        if(age>=18 && age<=65)
            this.age=age;
        else
            System.out.println("Invalid age! Age must be between 18 and 65.");
    }

    public int getAge(){
        // validation can be added here as well
        return age;
    }

    public void setSalary(double salary){
        if(salary>=10000){
            this.salary=salary;
        }else{
            System.out.println("Invalid Salary! It must be >=10000");
        }
    }

    public double getSalary(){
        // validation can be added here as well
        return salary;
    }

    public void setName(String name){
        if(!name.isBlank() && name.matches("[A-Za-z\s]+"))
            this.name=name;
        else
            System.out.println("Invalid Name! Name must contain only alphabets and spaces.");
    }

    public String getName(){
        return name;
    }

}


