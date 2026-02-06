// Last updated: 2/6/2026, 2:23:11 PM
class Solution {
public:
    bool isSameAfterReversals(int num) {
        if(num==0)return true;
        if(num%10==0)return false;
        else return true;   
    }
};