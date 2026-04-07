class Solution {
    public void sortColors(int[] nums) {
        int colors[]= new int[3];
        for(int i:nums){
            colors[i]=i==0?++colors[0]:i==1?++colors[1]:++colors[2];
        }
        int i=0;
            while(colors[0]!=0){
                nums[i]=0;
                i++;
                colors[0]--;
            }
            while(colors[1]!=0){
                nums[i]=1;
                i++;
                colors[1]--;
            }
            while(colors[2]!=0){
                nums[i]=2;
                i++;
                colors[2]--;
            }
        
    }
}