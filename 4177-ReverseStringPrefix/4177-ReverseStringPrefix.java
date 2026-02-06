// Last updated: 2/6/2026, 2:22:17 PM
class Solution {
    public String reversePrefix(String s, int k) {
        String rev = "";
        for(int i = k - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev + s.substring(k);
    }
}