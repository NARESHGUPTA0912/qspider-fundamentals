public class CheckPalindromeString {

    public static boolean isPalindrome(String s){
        String rev = "";
        int i = 0;
        while(i<s.length()){
            rev = s.charAt(i) + rev;
            i++;
        }
        return rev.equalsIgnoreCase(s);
    }

    public static boolean isPalindrome2(String s){
        int start = 0;
        int end = (s.length())-1;

        while(start<end){
            if(s.charAt(start) != s.charAt(end) ){
                return false;
            } 
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "naman";
        if(isPalindrome(str)){
            System.out.println(str + " is a Palindrome String");
        } else {
            System.out.println(str + " is not a Palindrome String");
        }
        if(isPalindrome2(str)){
            System.out.println(str + " is a Palindrome String");
        } else {
            System.out.println(str + " is not a Palindrome String");
        }
    }
}
