// Last updated: 2/6/2026, 2:22:27 PM
class Solution {
    public int centeredSubarrays(int[] nums) {
        int count = 0;
        int n = nums.length;
        for ( int i = 0; i < n; i++){
            long currentSum = 0;
            for ( int j = i; j <  n; j++) {
                currentSum += nums[j];
                for (int k = i; k <= j; k++){
                    if (nums[k] == currentSum) {
                        
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}