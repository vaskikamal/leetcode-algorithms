package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Single {

    public int singleNumber(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x = x ^ nums[i];
        }
        return x;
    }

    public int singleNumber_2(int[] nums) {
        Set<Integer> uniqueVals = new HashSet<>();
        int x = 0;

        for(int i=0; i < nums.length; i++){
            boolean isExisting = uniqueVals.add(nums[i]);
            if(!isExisting){
                uniqueVals.remove(nums[i]);
            }
        }
        return uniqueVals.iterator().next();
    }
    public static void main(String[] args) {

    }

}

