class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;

        while(k!=0){
            sum+=nums[nums.length-1];
           nums[nums.length-1]= nums[nums.length-1]+1;
           k--;
        }

        return sum;

    }
}