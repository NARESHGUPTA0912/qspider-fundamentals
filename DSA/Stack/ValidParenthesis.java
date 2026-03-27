package Stack;
import java.util.Stack;
public class ValidParenthesis {
    public static boolean isValidParenthesis(String s){
        if(s==null){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[')
                st.push(ch);
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.peek();
                if(top == '(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch == ']')
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }

    public static void runTestCases(String s){
        if(isValidParenthesis(s))
            System.out.println(s + ": This String have Valid Parenthisis.");
        else 
            System.out.println(s + ": This String have Invalid Parenthisis.");
    }

    public static void main(String[] args) {
        String testCase1 = "({]}[)";
        String testCase2 = "]}[)";
        String testCase3 = "(){[]}";
        String testCase4 = "({}[])";
        runTestCases(testCase1);
        runTestCases(testCase2);
        runTestCases(testCase3);
        runTestCases(testCase4);
    }
}
