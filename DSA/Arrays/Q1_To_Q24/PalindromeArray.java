package Q1_To_Q24;

public class PalindromeArray {
    public static void main(String[] args) {
        int[]a = {10,20,30,40,30,20,10};
        boolean isPalindrome = true;
        for(int i=0; i<a.length/2; i++){
            if(a[i]!=a[a.length-1-i]){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
