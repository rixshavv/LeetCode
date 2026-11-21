class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int k=0;
        int j=nums.length-1;
        int mid=k+(j-k)/2;

        int farr[]=new int[101];
        for(int i=0;i<nums.length;i++){
            farr[nums[i]]++;
        }

        if(farr[nums[mid]]==1){
            return true;
        }

        return false;
    }
}