class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==1)return 0;
        int ans=0;
        int l=0,r=n-1,lm=height[l],rm=height[r];
        while(l<r){
            if(lm<rm){
                l++;
                lm=Math.max(lm,height[l]);
                ans+=lm-height[l];
            }else{
                r--;
                rm=Math.max(rm,height[r]);
                ans+=rm-height[r];
            }
        }
        return ans;
    }
}
