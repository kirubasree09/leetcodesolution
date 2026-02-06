// Last updated: 2/6/2026, 2:24:10 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first,second);
    }
}