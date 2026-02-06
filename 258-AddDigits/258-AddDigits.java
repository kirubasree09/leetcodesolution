// Last updated: 2/6/2026, 2:24:09 PM
class Solution {
    public int addDigits(int num) {
        if (num==0) return 0;
        else return num%9==0?9:num%9;    
    }
}