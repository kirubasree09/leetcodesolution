// Last updated: 2/6/2026, 2:24:41 PM
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String s = Integer.toString(x);
        String reversed = new StringBuilder(s).reverse().toString();

        return s.equals(reversed);
                     
    }
}