// Last updated: 2/6/2026, 2:22:43 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp = x,sum = 0;
        while(x>0){
            sum = sum + x%10;
            x /= 10;
        }
        if(temp%sum == 0){
            return sum;
        }
        return -1;
    }
}