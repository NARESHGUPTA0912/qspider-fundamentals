class Solution{
    public int commonFactor(int a, int b){
        int count = 0;
        int i=1;
        while(i<=a && i<=b ){
            if(i%a == i%b){
                count++;
            }
        }
        return count;
    }
}

public class GCD {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Starts.....");
        System.out.println(s.commonFactor(12, 6));
    }
}
