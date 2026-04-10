class Solution {
    public String mergeAlternately(String words1, String words2) {
        int m=words1.length(),n=words2.length();
        int l=0,r=0;
        StringBuilder ans=new StringBuilder();
        while(l<m || r<n){
            if(l<m){
            ans.append(words1.charAt(l++));
            }
            if(r<n){
            ans.append(words2.charAt(r++));
            }
        }
        // if(l<m){
        //     ans= ans+words1.substring(l,m);
        // }else if(r<n){
        //     ans= ans+words2.substring(r,n);
        // }
        return ans.toString();
    }
}