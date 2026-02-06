// Last updated: 2/6/2026, 2:22:30 PM
class Solution {
    public int minSwaps(int[] nums, int[] forbidden) {
        HashMap<Integer, Integer> hmn=new HashMap<>();
        HashMap<Integer, Integer> hmf=new HashMap<>();
        HashMap<Integer, Integer> hms=new HashMap<>();
        int same=0;
        int maxs=0;
        for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==forbidden[i])
                {
                    same+=1;
                    hms.put(nums[i], hms.getOrDefault(nums[i], 0)+1);
                    maxs=Math.max(maxs, hms.get(nums[i]));
                }
                hmn.put(nums[i], hmn.getOrDefault(nums[i], 0)+1);
                hmf.put(forbidden[i], hmf.getOrDefault(forbidden[i], 0)+1);
            }
        if(same==0)
        {
            return 0;
        }
        for(int i:hmn.keySet())
            {
                int change=hmn.get(i);
                int fd=hmf.getOrDefault(i, 0);
                if(change>nums.length-fd)
                {
                    return -1;
                }
            }
        return Math.max((same+1)/2, maxs);
    }
}