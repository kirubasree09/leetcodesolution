// Last updated: 2/6/2026, 2:24:19 PM
public class Solution {
    public int titleToNumber(String s) {
        if (s == null) return -1;
        int sum = 0;
        
        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }
}