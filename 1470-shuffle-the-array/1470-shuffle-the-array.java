class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int k=0;
        for(int i=0;i<n;i++){
            int j=i+n;
            ans[k++]=nums[i];
            ans[k++]=nums[j];
        }

        return ans;
    }
}