// Last updated: 2/6/2026, 2:23:01 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1)return 0;
        if(n%2==0)return n/2;
        else{
            return n;
        }
        
    }
}