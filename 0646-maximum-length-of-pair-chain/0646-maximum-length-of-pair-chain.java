class Solution {
    int n;
    public int solve(int[][] pairs,int idx,int prev,int[][] dp){
        if(idx==n){
            return 0;
        }
        if(prev!=-1 && dp[prev][idx]!=-1){
            return dp[prev][idx];
        }
        int take=0;
        if(prev==-1 || pairs[idx][0]>pairs[prev][1]){
            take=1+solve(pairs,idx+1,idx,dp);
        }
        int nottake=solve(pairs,idx+1,prev,dp);
        if(prev!=-1){
            dp[prev][idx]=Math.max(take,nottake);
        }
        return Math.max(take,nottake);
    }
    public int findLongestChain(int[][] pairs) {
        n=pairs.length;
        int dp[][]=new int[n+1][n+1];
        for(int[] pair:dp){
            Arrays.fill(pair,-1);
        }
        Arrays.sort(pairs,(a,b)->Integer.compare(a[0],b[0]));
        return solve(pairs,0,-1,dp);
    }
}