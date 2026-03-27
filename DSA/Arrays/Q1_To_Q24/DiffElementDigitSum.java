package Q1_To_Q24;

public class DiffElementDigitSum {
    public static void main(String[] args) {
        int[] nums = {121, 102, 125 , 10, 112};
        int elementSum = 0, digitSum = 0;

        for(int n: nums){
            elementSum += n;
            while(n > 0){
                digitSum += n%10;
                n /= 10;
            }
        }
        System.out.println(elementSum - digitSum);
    }
}
