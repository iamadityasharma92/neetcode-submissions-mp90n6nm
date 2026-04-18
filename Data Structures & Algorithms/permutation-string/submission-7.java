class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length(),n2=s2.length();
        int c1[]=new int[26];
        int c2[]=new int[26];
        if(n2<n1)return false;
        //store initial window
        for(int i=0;i<n1;i++){
            c1[s1.charAt(i)-'a']++;
            c2[s2.charAt(i)-'a']++;
        }
        int l=0,r=n1;// start from first window
        while(r<n2){
            if(matches(c1,c2)){
                return true;
            }else{
                // shrink
                c2[s2.charAt(l++)-'a']--;
                // expand
                c2[s2.charAt(r)-'a']++;
                r++;
            }
        }
        // check if permutation is there in last part
        return matches(c1,c2);
    }

    private boolean matches(int[] c1,int[] c2){
        for(int i=0;i<26;i++){
            if(c1[i]!=c2[i])
            return false;
        }
        return true;
    }
}
