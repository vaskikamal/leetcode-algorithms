package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateOrNot {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> dup = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if(!dup.add(nums[i])){
                    return true;
                }
            }
            return false;
        }


    public static void main(String [] args){
        int [] arr  =  {1,2,3,1};
        DuplicateOrNot duplicateOrNot = new DuplicateOrNot();
        duplicateOrNot.containsDuplicate(arr);
    }
    // doe snot work well for all scenarios
    public boolean containsDuplicate_1(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x = x ^ nums[i];
        }
        if (x != 0) {
            return true;
        } else {
            return false;
        }
    }
}
