// Last updated: 2/6/2026, 2:23:22 PM
class Solution {
    public int arraySign(int[] nums) {
        int sum=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return 0;
            if(nums[i]<0) sum=-sum;
        }
        return sum;
    }
}