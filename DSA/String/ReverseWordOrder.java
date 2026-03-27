package String;

public class ReverseWordOrder {
    public static void main(String[] args) {
        System.out.println(reverseWordOrder("Hello Java Language"));
    }

    public static String reverseWordOrder(String  s){
        s = s.trim();
        String res = "";
        String temp = "";

        for(int i=0; i<s.length()-1; i++){
            char c = s.charAt(i);
            if(c == ' '){
                res = temp+res;
                temp = "";
            }
            temp = temp+c;
        }
        return res;
    }
}
