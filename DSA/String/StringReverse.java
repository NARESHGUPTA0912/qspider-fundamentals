package String;

public class StringReverse {
    
    public static String reverseSentence(String s){
        String rev = "";

        // first way
        // for(char ch: s.toCharArray()){
        //     rev=ch+rev;
        // }
        // second way
        // for(int i=0; i<s.length();i++){
        //     rev = s.charAt(i) + rev;
        // }
        //  third way
        for(int i=s.length()-1; i>=0; i--){
            rev+=s.charAt(i);
        }
        return rev;
    }

    public static String reverseEachWord(String s){
        String result="";
        for(char ch: s.toCharArray()){
            String temp="";
            while(ch!=' '){
                temp = ch+temp;
            }
            result = temp;
        }
        return result;
    }

    public static String reverseEachWord2(String s){
        String result="",   temp="";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c!=' '){
                temp = c+temp;
            }
            if(c==' ' || i==s.length()-1){
                result = result+" "+temp;
                temp="";
            }
        }
        return result;
    }
    public static String reverseWordSequence(String s){
        String result="",   temp="";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c!=' '){
                temp = temp+c;
            }
            if(c==' ' || i==s.length()-1){
                result = temp+" "+result;
                temp="";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // System.out.println(reverseSentence("Prince Gupta  "));
        System.out.println(reverseEachWord2("Prince Gupta  "));
    }
}
