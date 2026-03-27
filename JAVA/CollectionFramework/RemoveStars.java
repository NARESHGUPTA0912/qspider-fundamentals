package CollectionFramework;

import java.util.Stack;

public class RemoveStars{

    public static String removeStars(String s){
        Stack<Character> stack  = new Stack<>();
        String res ="";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != '*')
                stack.push(c);
            else
                stack.pop();
        }
        for(char ch: stack){
                res = res + ch;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
}