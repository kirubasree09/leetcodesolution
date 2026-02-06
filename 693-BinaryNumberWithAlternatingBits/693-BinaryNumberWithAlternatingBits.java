// Last updated: 2/6/2026, 2:23:51 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
         int x = (n^(n>> 1));
         return(x&(x+1))==0?true:false;

    }
}