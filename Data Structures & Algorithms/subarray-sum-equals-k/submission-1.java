class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0,sum=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i:nums){
            sum+=i;
            int diff=sum-k;
            ans+=map.getOrDefault(diff,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}