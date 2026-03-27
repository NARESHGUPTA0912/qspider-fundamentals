package Q1_To_Q24;

public class LargestString {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "JavaScript", "React", "BootStrap","Swing"};
        String largest = arr[0];
        for(String s: arr){
            if(largest.length() < s.length()){
                largest = s;
            }
        }
        System.out.println("Largest String:\n"+largest +" -> "+largest.length());
    }
}
