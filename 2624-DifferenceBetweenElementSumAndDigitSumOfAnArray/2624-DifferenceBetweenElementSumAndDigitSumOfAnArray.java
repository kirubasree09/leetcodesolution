// Last updated: 2/6/2026, 2:23:00 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int s=0;
        for(int num:nums)
        {
            sum+=num;
            int n=num;
            while(n>0){
            
                s=s+n%10;
                n=n/10;
            }
        }
        return Math.abs(sum-s);
    }
}