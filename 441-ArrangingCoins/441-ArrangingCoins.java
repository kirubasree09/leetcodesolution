// Last updated: 2/6/2026, 2:23:56 PM
class Solution {
    public int arrangeCoins(int n) {
        int i = 1; 
		while(n > 0){ 
			i++; 
			n = n-i; 
		}
		return i-1; 
    }
}