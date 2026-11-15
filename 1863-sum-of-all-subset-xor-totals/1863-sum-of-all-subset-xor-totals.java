class Solution {
    int sum=0;

    public void solve(int[] nums, int index,int xor){
        if(index==nums.length){
            sum+=xor;
            return;
        }
        solve(nums,index+1,xor^nums[index]);
        solve(nums,index+1,xor);
    }
    public int subsetXORSum(int[] nums) {
         solve(nums,0,0);
         return sum;

    }
}