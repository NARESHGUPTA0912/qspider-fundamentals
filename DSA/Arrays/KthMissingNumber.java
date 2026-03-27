public class KthMissingNumber {
    
    public static int findKthElement(int[] arr, int k){
        for(int num: arr){
            if(num<=k){
                k++;
            }else {
                break;
            }
        }
        return k;
    }

    public static int pivotIndex(int[] nums){
        int sum=0;
        for(int n: nums)
            sum+=n;
        int leftSum = 0;
        for(int i=0; i<nums.length;i++){
            if(leftSum == sum-leftSum-nums[i])
                return i;
            leftSum+=nums[i];
        }
        return -1;
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]>0 && nums[i]<=n && nums[i]!=nums[nums[i]-1]){
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        return n+1;
    }



    public static void main(String[] args) {
        // int[] arr = {12,21,32,12,22,1}; 
        // int k = findKthElement(arr, 5);
        // System.out.println("kth Element: "+k);
        int [] nums = {3,4,-1,1};
        int n = firstMissingPositive(nums);
        System.out.println("First Missing Positive: "+n);


    }
}
