// Last updated: 2/6/2026, 2:24:06 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int x = n*(n+1)/2;
        int y = 0;
        for(int i = 0 ; i < n ; i++){
           y += nums[i];
        }
        return x - y;
    }
}