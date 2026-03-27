package String.Program1_Program25;

public class P21_ZigZagString {
    
    public static String printZigZag(String s, String t){

        String res = "";
        int i=0;
        while(i<s.length() && i<t.length()){
            res = res + s.charAt(i) + t.charAt(i);
            i++;
        }
        if(i<s.length()){
             res = res + s.substring(i);
        }
        if(i<t.length()){
            res = res + t.substring(i);
        } 

        return res;
    }

    public static void main(String[] args){
        System.out.println(printZigZag("amtrila", "naresh"));
    }
}
