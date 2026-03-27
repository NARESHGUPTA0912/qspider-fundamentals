package Q1_To_Q24;

public class TwoArrayPalindrome {
    public static void main(String[] args) {
        int []a = {10,20,30,40,50,60,70};
        int []b = {70,60,50,40,360,20,10};

        boolean isPalindrome = true;
        for(int i=0; i<a.length; i++){
            if(a[i] != b[b.length-1-i]){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
