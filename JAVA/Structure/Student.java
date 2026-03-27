package Structure;
class StudentDetails{
    String studentName;
    int studentId;
    double studentMarks;
    long studentMobile;
}

public class Student {
    public static void main(String[] args) {
        StudentDetails s = new StudentDetails();
        s.studentName = "Prince Gupta";
        s.studentId = 22;
        s.studentMarks = 79.67;
        s.studentMobile = 97965789;

        System.out.println("Student Name: " + s.studentName);
        System.out.println("Student Id: " + s.studentId);
        System.out.println("Student Marks: " + s.studentMarks);
        System.out.println("Student Mobile: " + s.studentMobile);
        System.out.println(s);
    }
}
