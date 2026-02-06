// Last updated: 2/6/2026, 2:24:02 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        return pow(n);
    }
    public static boolean pow(int n){
        if(n == 1) return true;
        if(n%4 !=0) return false;
        return pow(n/4);
    }
}