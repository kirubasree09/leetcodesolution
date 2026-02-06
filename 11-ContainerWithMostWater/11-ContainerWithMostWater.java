// Last updated: 2/6/2026, 2:24:39 PM
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        int currentarea=0;
        while(left<right){
         currentarea=Math.min(height[left],height[right])*(right-left); 
         max=Math.max(currentarea,max);
        
        if(height[left]>height[right]){
          right--;
        }else{
            left++;
        }
        
    }return max;
}}