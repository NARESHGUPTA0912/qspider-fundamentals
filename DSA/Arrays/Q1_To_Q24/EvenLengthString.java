package Q1_To_Q24;

public class EvenLengthString {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "JavaScript", "React", "BootStrap","SwingUtilities"};
        int count = 0;
        for(String s: arr){
            if(s.length() % 2 == 0){
                System.out.println(s);
                count++;
            }
        }
        System.out.println("Count: "+count);
    }
}
