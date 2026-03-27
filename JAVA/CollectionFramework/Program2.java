package CollectionFramework;

import java.util.ArrayList;

class Program2{
    public static void main(String[] args) {
        ArrayList<Integer> student = new ArrayList<>();
        student.add(12);
        student.add(1121);
        student.add(12);
        student.add(1221);
        student.add(1111);
        student.add(12221);
        student.add(12141);
        student.add(1242);
        System.out.println(student.indexOf(1121));
        
    }
}