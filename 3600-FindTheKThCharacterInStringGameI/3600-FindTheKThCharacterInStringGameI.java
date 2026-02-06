// Last updated: 2/6/2026, 2:22:38 PM
class Solution {
    public char kthCharacter(int k) {
        return (char)('a' + Integer.bitCount(k - 1));
    }
}