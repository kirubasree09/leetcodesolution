// Last updated: 2/6/2026, 2:22:48 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int h:hours){
            if(h>=target){
                count++;
            }
        }
        return count;  
    }
}