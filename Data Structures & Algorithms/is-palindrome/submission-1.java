class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.replaceAll(" ","");
        int l=0,r=s.length()-1;
        s=s.toLowerCase();
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
            
        }
        return true;
    }
}
