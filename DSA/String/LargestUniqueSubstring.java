package String;

import java.util.Arrays;

public class LargestUniqueSubstring {
    
    public static int getLengthOfLargestUniqueSubString(String s){

        int[] index = new int[128];

        Arrays.fill(index,-1);
        // for(int i=0; i<128; i++)
            // index[i] = -1;
        int left = 0, maxLength = 0;
        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);
            if(index[c] >= left)
                left = index[c]+1;
            index[c] = right;
            int tempLength = right-left+1;
            if(tempLength > maxLength)
                maxLength = tempLength;
        }
        return maxLength;
    }

    public static String getLargestUniqueSubstring(String s){

        int[] index = new int[128];

        Arrays.fill(index,-1);
        int left = 0, maxLength = 0, start=0;

        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);
            if(index[c] >= left)
                left = index[c]+1;
            index[c] = right;
            int tempLength = right-left+1;
            if(tempLength > maxLength){
                maxLength = tempLength;
                start = left;
            }
        }
        return s.substring(start, start+maxLength);
    }
    public static void main(String[] args) {
        String s = "abcbadebcdbd";
        System.out.println(getLengthOfLargestUniqueSubString(s));
        System.out.println(getLargestUniqueSubstring(s));
    }
}
