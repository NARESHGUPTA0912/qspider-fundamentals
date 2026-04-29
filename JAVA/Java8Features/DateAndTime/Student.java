package Java8Features.DateAndTime;

import java.time.LocalDate;

public class Student {
    String studentName;
    LocalDate dob;

    Student(String studentName, LocalDate dob){
        this.studentName = studentName;
        this.dob = dob;
    }

    @Override
    public String toString(){
        return "Student Name: " + studentName + ", Date of Birth: " + dob + ", Student age: " + getAge(dob);
    }

    public static int getAge(LocalDate dob){
        return LocalDate.now().getYear() - dob.getYear();
    }

    public static void main(String[] args) {

        Student s1 = new Student("Prince", LocalDate.of(2002, 12, 9));
        Student s2 = new Student("Rahul", LocalDate.of(2003, 5, 15));
        Student s3 = new Student("Bobby", LocalDate.of(2001, 8, 22));
        Student s4 = new Student("Charlie", LocalDate.of(2000, 11, 30));
        Student s5 = new Student("Dev", LocalDate.of(2004, 3, 10));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
