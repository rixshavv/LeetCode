class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        int common=-1;
        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                common=nums1[i];
                i++;
                j++;
                return common;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        return common;
        
    }
}