class Solution {

    public String encode(List<String> strs) {
        String s="";
        for(String str:strs){
            int l= str.length();
            s=s+l+"|"+str;
        }
        return s.trim();
    }

    public List<String> decode(String str) {
        // iterate over string find the dilimter and then length and then extract N characters repeat this untill reached end
        List<String> ans = new ArrayList<>();
        int i =0;
        while(i<str.length()){
            int j = str.indexOf('|',i);// find index of delimiter after i
            int l= Integer.parseInt(str.substring(i,j));
            String s = str.substring(j+1,j+l+1);
            ans.add(s);
            i=j+1+l;
        }
        return ans;
    }
}
