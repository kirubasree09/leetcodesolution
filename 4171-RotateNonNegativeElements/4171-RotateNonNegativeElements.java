// Last updated: 2/6/2026, 2:22:20 PM
class Solution {
    public int[] rotateElements(int[] nums, int k) {
        if(k == 0) return nums;
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(nums[i] >= 0) {
                set.add(i);
                list.add(nums[i]);
            }
        }
        int sz = list.size();
        if(sz == 0) return nums;
        k = k % sz;
        if(k == 0) return nums;
        rev(list, 0, k - 1);
        rev(list, k, sz - 1);
        rev(list, 0, sz - 1);
        int idx = 0;
        for(int i = 0; i < n; i++) {
            if(set.contains(i)) {
                nums[i] = list.get(idx++);
            }
        }
        return nums;
    }
    void rev(List<Integer> list, int l, int h) {
        while(l < h) {
            int temp = list.get(l);
            list.set(l, list.get(h));
            list.set(h, temp);
            l++;
            h--;
        }
    }
}
