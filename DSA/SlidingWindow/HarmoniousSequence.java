import java.util.*;
public class HarmoniousSequence {
    public static int findLongestHarmoniousSubsequence(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Count frequency of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int maxLen = 0;
        
        // For every unique value x in the map, check if x+1 exists
        for (int num : countMap.keySet()) {
            if (countMap.containsKey(num + 1)) {
                int currentLength = countMap.get(num) + countMap.get(num + 1);
                maxLen = Math.max(maxLen, currentLength);
            }
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
         int[] list = new int[]{1,3,2,2,5,2,3,7};
         System.out.println(findLongestHarmoniousSubsequence(list));
    }
}
