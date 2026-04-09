class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1=nums1.length;
        for(int i=0;i<n;i++){
            nums1[m1-n+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}