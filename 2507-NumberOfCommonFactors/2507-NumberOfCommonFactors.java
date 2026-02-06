// Last updated: 2/6/2026, 2:23:07 PM
class Solution {
    public int commonFactors(int a, int b) {
         int count=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0 && b%i==0)
            {
                count++;
            }
        }
        return count;
        
    }
}