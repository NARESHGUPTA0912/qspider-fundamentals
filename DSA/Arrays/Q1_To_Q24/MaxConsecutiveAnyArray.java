package Q1_To_Q24;

public class MaxConsecutiveAnyArray {
    
    public static void main(String[] args) {
        int[] arr = {11,2,3,7,1,1,1,1,1,1,1,1,1,2,3,4,5,6};
        int count=0, max=0;
        for(int x: arr){
            if(x==1){
                count++;
                if(count>max){
                    max = count;
                }
            }else{
                count = 0;
            }
        }System.out.println(max);
    }
}
