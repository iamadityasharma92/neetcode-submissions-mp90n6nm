class Solution {
    public String mergeAlternately(String words1, String words2) {
        int m=words1.length(),n=words2.length();
        int l=0,r=0;
        String ans="";
        while(l<m && r<n){
            ans=ans+words1.charAt(l);
            l++;
            ans=ans+words2.charAt(r);
            r++;
        }
        if(l<m){
            ans= ans+words1.substring(l,m);
        }else if(r<n){
            ans= ans+words2.substring(r,n);
        }
        return ans;
    }
}