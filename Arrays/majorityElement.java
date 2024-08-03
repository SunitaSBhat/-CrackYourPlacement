class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int s1=nums[0];
        
      for(int i=1; i<nums.length; i++){
        if(nums[i]==s1){
            count++;
        }
        else if(count<=0){
            s1=nums[i];
            count=1;
        }
        else if(nums[i]!=s1){
            count--;
        }
       
      } 
      return s1; 
    }
}