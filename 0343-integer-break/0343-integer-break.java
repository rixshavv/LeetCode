class Solution {
    int dp[];
    public int solve (int n){
        if(n==1){
            return 1;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        int res=Integer.MIN_VALUE;

        for(int i=1;i<=n-1;i++){
            int prod=i*Math.max(n-i,solve(n-i));
            res=Math.max(res,prod);
        }
        dp[n]=res;
        return res;
    }
    public int integerBreak(int n) {
        dp=new int[59];
        Arrays.fill(dp,-1);
        return solve(n);
    }
}