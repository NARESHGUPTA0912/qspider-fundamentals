package String;

public class StringDecode {
    public static String encode(String s){
        if(s==null || s.length() == 0)
            return s;
        else if(s.length()==1)
            return s+1;

        int count = 1;
        String res = "";
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i))
                count++;
            else{
                res = res + s.charAt(i-1) + count;
                count = 1;
            }
        }
        return res + s.charAt(s.length()-1)+count;
    }

    public static String decode(String s){
        if(s==null || s.length() == 0)
            return s;
        if(s.length()==1)
            return s;
        String res = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int count = 0;
            while(i+1<s.length() && Character.isDigit(s.charAt(i+1))){
                count = count*10 + (s.charAt(i+1)-'0');
                i++;
            }
            for(int j=0; j<count; j++)
                res = res + c;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "A3B4C125D2";
        System.out.println(decode(s));
    }
}
