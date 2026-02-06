// Last updated: 2/6/2026, 2:24:04 PM
class Solution {
   
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int arr[]=new int[n];
        int j=n-1;
        int i=(n-1)/2;
        int k=0,l=1;
        while(k<n){
            if(k<n) arr[k]=nums[i--];
            if(l<n) arr[l]=nums[j--];
            k+=2;
            l+=2;
        }
        for(int idx=0;idx<n;idx++){
            nums[idx]=arr[idx];
        }
    }
}