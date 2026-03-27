package Q1_To_Q24;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,1,0,0,0,0,0,1,1,0,1,1,1,1,1,1,1,1,1};
        int max = 0, count=0;
        for(int x: nums){
            if(x==1){
                count++;
                // max = Math.max(max, count);
                if(count>max) max=count;
            }else{
                count = 0;
            }
        }
        System.out.println("Most Consecutive One's: "+max);
    }
    
}
