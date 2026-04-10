class Solution {
    public int firstMissingPositive(int[] nums) {
        int n= nums.length;
        boolean [] bool=new boolean[n];
        for(int num:nums){
            if(num>0 && num<=n)
            bool[num-1]=true;
        }
        for(int i=0;i<n;i++){
            if(bool[i]!=true){
                return i+1;
            }
        }
        return n+1;
    }
}