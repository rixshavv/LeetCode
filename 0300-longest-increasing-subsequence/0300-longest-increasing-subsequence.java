class Solution {
    int n;
    public int solve(int[] nums,int idx,int prev,int [][]dp){
        if(idx>=n){
            return 0;
        }
        //take
        if(prev!=-1 && dp[idx][prev]!=-1){
            return dp[idx][prev];
        }
        int take=0;
        if(prev==-1 || nums[prev]<nums[idx]){
            take=1+solve(nums,idx+1,idx,dp);
        }
        //skip
        int skip=solve(nums,idx+1,prev,dp);

       if(prev!=-1) dp[idx][prev]=Math.max(take,skip);
        return Math.max(take,skip);
        
    }
    public int lengthOfLIS(int[] nums) {
        n=nums.length;
        int dp[][]=new int[n+1][n+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }

        return solve(nums,0,-1,dp);

    }
}