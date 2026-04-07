class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        if(n==1) return;
        int l=0,r=n-1,i=0;
        while(i<=r){
            if(nums[i]==0){
                nums[i]=nums[l];
                nums[l]=0;
                l++;
                i++;
            }else if(nums[i]==2){
                nums[i]=nums[r];
                nums[r]=2;
                r--;
            }else{
                i++;
            }

        }
    }
}