// Last updated: 2/6/2026, 2:23:31 PM
class Solution {
    public int maximum69Number(int num) {
  char[] digits = String.valueOf(num).toCharArray();  
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break; 
            }
        }
        return Integer.parseInt(new String(digits));
    }
}