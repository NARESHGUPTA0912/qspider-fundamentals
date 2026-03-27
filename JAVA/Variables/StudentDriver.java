class StudentDetails {
    // static variable
    static String collegeName = "Aktu University";

    // instance variables
    int rollNo;
    String name;
    double marks;

    public void setStudentInfo(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void getStudentInfo() {
        String grade;  // local variable
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 75) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else {
            grade = "C";
        }

        System.out.println("College Name: " + collegeName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------------------");
    }
}

public class StudentDriver {
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        s1.setStudentInfo(7, "Naresh Gupta", 86.5);
        s1.getStudentInfo();

        StudentDetails s2 = new StudentDetails();
        s2.setStudentInfo(11, "Sneha Verma", 92.0);
        s2.getStudentInfo();
    }
}
