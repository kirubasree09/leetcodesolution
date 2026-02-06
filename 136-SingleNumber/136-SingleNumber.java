// Last updated: 2/6/2026, 2:24:21 PM
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0; 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  
        }
        return ans;    
    }
}