class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0,r=0;
        Set<Integer> window= new HashSet<>();
        while(r<nums.length){
            if(r-l>k){
                window.remove(nums[l++]);
            }
            if(window.contains(nums[r])){
                return true;
            }
            window.add(nums[r++]);
        }
        return false;
    }
}