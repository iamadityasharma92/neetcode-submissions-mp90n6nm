class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //brute force check for all substrings of s2
    char[] chars1 = s1.toCharArray();
    Arrays.sort(chars1);
    s1 = new String(chars1);
    int n1=s1.length(),n2=s2.length();
        for(int i=0;i<=n2-n1;i++){
                boolean ans=checkIfPresent(s1,s2.substring(i,i+n1));
                if(ans)
                return ans;
            
        }
        return false;

    }

    public boolean checkIfPresent(String s1,String s2){
    char[] chars2 = s2.toCharArray();
    Arrays.sort(chars2);
    String sorted2 = new String(chars2);
    return s1.equals(sorted2);
    }
}
