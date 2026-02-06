// Last updated: 2/6/2026, 2:23:21 PM
class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length, max_pair_sum = 0;
        Arrays.sort(nums);

        int i = 0, j = n - 1;
        while (i < j) {
            max_pair_sum = Math.max(max_pair_sum, nums[i] + nums[j]);
            i++;
            j--;
        }

        return max_pair_sum;
    }
}