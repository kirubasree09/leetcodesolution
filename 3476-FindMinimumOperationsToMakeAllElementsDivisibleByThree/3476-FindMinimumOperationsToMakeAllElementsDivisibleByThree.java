// Last updated: 2/6/2026, 2:22:42 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for(int num : nums) {
            if(num % 3 != 0) ans++;
        }
        return ans;
    }
}
