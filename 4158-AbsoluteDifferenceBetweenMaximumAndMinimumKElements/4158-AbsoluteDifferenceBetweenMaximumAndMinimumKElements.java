// Last updated: 2/6/2026, 2:22:23 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int smallestSum = 0;
        int largestSum = 0;
        for(int i = 0;i < k;i++){
            smallestSum += nums[i];
        }
        for(int i = n - k;i < n;i++){
            largestSum += nums[i];
        }
        return Math.abs(largestSum - smallestSum);
    }
}