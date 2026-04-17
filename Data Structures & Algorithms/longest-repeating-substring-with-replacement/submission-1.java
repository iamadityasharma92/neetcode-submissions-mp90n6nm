class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,ans=0,maxf=0;
        int hash[]=new int[26];
        while(r<s.length()){
            int idx1=s.charAt(r)-'A';
            hash[idx1]++;
            maxf=Math.max(maxf,hash[idx1]);
            while(((r-l+1)-maxf)>k){
                hash[s.charAt(l)-'A']--;
                maxf=0;
                for(int i:hash)
                maxf=Math.max(i,maxf);
                l++;
            }
            if((r-l+1)-maxf<=k){
                ans=Math.max(ans,r-l+1);
            }
            r++;
        }
        return ans;
    }
}
