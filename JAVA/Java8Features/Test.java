package Java8Features;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    
    static class DescOrderSort implements Comparator<Integer>{
        @Override
        public int compare(Integer i1, Integer i2){
            return i2-i1;
        }
    }

    public static void main(String[] args){
        Integer []nums = new Integer[] {10, 270, 870, 40, 50};
        System.out.println("Before Sorting: " + Arrays.toString(nums));
        Arrays.sort(nums, new DescOrderSort());
        System.out.println("After Sorting: " + Arrays.toString(nums));
    }
}