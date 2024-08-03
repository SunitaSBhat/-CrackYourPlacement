import java.util.*;
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> set = new HashMap<>();
        int cumSum=0;
        int count=0;
        set.put(0, 1);
        for(int i=0; i<nums.length; i++){
            cumSum+=nums[i];
           int remainder= cumSum%k;
           if(remainder<0){
            remainder+=k;
           }
           if(set.containsKey(remainder)){
            count+=set.get(remainder);
           }
           set.put(remainder, set.getOrDefault(remainder, 0)+1);
        }
        return count;
    }
}