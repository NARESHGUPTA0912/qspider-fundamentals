package Q1_To_Q24;

public class ProductExceptSelf2 {
    
    public static void main(String[] args) {
        int[] nums = {1,7,3,4,5};
        int n = nums.length;
        int []res = new int[n];

        int left = 1;
        for(int i=0; i<n; i++){
            res[i] = left;
            left *= nums[i];
        }
        int right = 1;
        for(int i=n-1; i>=0; i--){
            res[i] *= right;
            right *= nums[i];
        }
        for(int x: res){
            System.out.println(x + " ");
        }
    }
}
