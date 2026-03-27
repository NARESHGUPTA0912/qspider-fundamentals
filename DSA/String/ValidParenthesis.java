package String;

import java.util.Stack;

public class ValidParenthesis {
    
    public static boolean isValid(String s){
        if(s.length()%2 == 1){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            } else {
                if(st.isEmpty()){
                    return false;
                }
                char op = st.pop();
                if(op == '[' && c != ']' || op == '{' && c != '}' || op == '(' && c != ')'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static boolean isValid2(String s){
        if(s.length()%2 == 1){
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                sb.append(c);
            } else {
                if(sb.length()==0)
                    return false;
                char op =  sb.charAt(sb.length()-1);
                if(op == '[' && c != ']' || op == '{' && c != '}' || op == '(' && c != ')'){
                    return false;
                }sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.length()==0;
    }

    public static int minAddToMakeValid(String s){
        int insert =0, op=0;
        for (char c: s.toCharArray()){
            if (c=='('){
                op++;
            } else {
                if(op>0)
                    op--;
                else
                    insert++;
            }
        }
        return insert+op;
    }

    public static int longestValidParenthesis(String s){
        int maxLength = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(')
                st.push(i);
            else{
                st.pop();
                if(st.isEmpty())
                    st.push(i);
                else
                    maxLength = Math.max(maxLength, i-st.peek());
            }
        }
        return maxLength;
    }

    public static boolean checkValidString(String s){
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='[' || c=='*'){
                sb.append(c);
            } else {
                if(sb.length()==0)
                    return false;
                char op =  sb.charAt(sb.length()-1);
                if(op == '[' && c != ']' || c!='*' || op == '{' && c != '}' || c!='*' || op == '(' && c != ')' || c!='*'){
                    return false;
                }sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.length()==0;
    }

    public boolean isValidPassword(String s){
        if(s.length()<8)
            return false;
        int up=0, low=0, digit=0, spc=0;
        for(char c: s.toCharArray()){
            if(Character.isUpperCase(c))
                up++;
            else if(Character.isLowerCase(c))
                low++;
            else if(Character.isDigit(c))
                digit++;
            else
                spc++;
        }
        return up>0&&low>0&&digit>0&&spc>0;
    }

    public static void main(String[] args) {
        // System.out.println(isValid("()(){}[]"));
        // System.out.println(isValid2("()(){}[]"));
        // System.out.println(minAddToMakeValid("()()((()(()"));
        // System.out.println(longestValidParenthesis("(())(()())"));
        System.out.println(checkValidString("(*]())}*)"));
        
    }
}
