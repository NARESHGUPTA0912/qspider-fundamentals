package CollectionFramework;

import java.util.Stack;

public class Program3 {
    
    public static void main(String[] args){
        
        Stack<Character> st = new Stack<>();
        st.push('a');
        st.push('b');
        st.push('c');
        st.push('d');

        System.out.println(st);
        String res = "";
        for(char ch : st){
            res += ch;
        }
        System.out.println(res);
    }
}
