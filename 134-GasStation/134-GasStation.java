// Last updated: 2/6/2026, 2:24:23 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot_gas = 0;
        int tank = 0;
        int start = 0;
        
        for(int i=0;i<gas.length;i++){
            int rem = gas[i]-cost[i];
            tot_gas+=rem;
            tank+=rem;

            if(tank<0){
                start=i+1;
                tank=0;
            
            }

        }
        if(tot_gas>=0){
            return start;
        }
        else{
            return -1;
        }
    }
}