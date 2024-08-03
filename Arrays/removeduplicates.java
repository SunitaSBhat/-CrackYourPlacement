import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0; 
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                nums[k]=nums[i];
                set.add(nums[i]);
                k++;
            }
        }
        return k;
    }
}