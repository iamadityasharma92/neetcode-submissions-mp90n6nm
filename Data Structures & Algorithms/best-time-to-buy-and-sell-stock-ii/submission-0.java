class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==1)return 0;
        int sum =0;
        for(int i=1;i<n;i++){
            sum+=Math.max(0,prices[i]-prices[i-1]);
        }
        return sum;
    }
}