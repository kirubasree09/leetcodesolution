// Last updated: 2/6/2026, 2:22:39 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigit = 0;
        int doubleDigit = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<10) singleDigit+=nums[i];
            else doubleDigit+=nums[i];
        }
        return singleDigit!=doubleDigit;
    }
}