// Last updated: 2/6/2026, 2:24:48 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Map<Character,Integer>map =new HashMap<>();
        int i=0,j=0,maxLen=0;
        while(j<n){
            char rightChar=s.charAt(j);
            map.put(rightChar,map.getOrDefault(rightChar,0)+1);
            while((j-i+1)>map.size()){
                char leftChar=s.charAt(i);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}