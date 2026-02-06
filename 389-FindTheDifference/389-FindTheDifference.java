// Last updated: 2/6/2026, 2:24:00 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for(int i = 0;i < t.length();i++){
            sum^= t.charAt(i);
        }
        for(int i = 0;i < s.length();i++){
            sum^= s.charAt(i);
        }
        return(char)sum;
    }
}