class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0,sum=0,mini=Integer.MAX_VALUE,n=nums.length;
        while(r<n){
            if(sum<target){
                sum+=nums[r];
                r++;
            }else if(sum>=target){
                mini=Math.min(mini,r-l);
                sum-=nums[l];
                l++;
            }
        }
        while(l<n){
            if(sum>=target){
                mini=Math.min(mini,r-l);
                sum-=nums[l];
                l++;
            }else{
                break;
            }
        }
        return mini==Integer.MAX_VALUE?0:mini;
    }
}