class Solution {
    public int maxArea(int[] nums) {
        int n= nums.length;
        int ans=0;
        for(int i =0;i<n;i++){
            int area=0;
            for(int j=i+1;j<n;j++){
                area=(j-i)*(Math.min(nums[j],nums[i]));
                ans=Math.max(ans,area);

            }
        }
        return ans;
    }
}
