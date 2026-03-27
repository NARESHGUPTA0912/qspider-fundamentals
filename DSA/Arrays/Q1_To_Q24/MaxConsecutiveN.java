package Q1_To_Q24;

public class MaxConsecutiveN {
    public static void main(String[] args) {
        int n = 2;

        int[] a = {1,4,5,6,6,6,64,2,3,3,2,2,2,2,2,2,3,2,3};
        int count=0,max=0;
        for(int x: a){
            if(x==n){
                count++;
                if(count>max){
                    max=count;
                }
            } else {
                count = 0;
            }
        }System.out.println("Maximum Consecutive N: "+max);
    }
}
