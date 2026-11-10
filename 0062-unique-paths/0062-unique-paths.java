class Solution {
    // int [][]dp;
    // int m;
    // int n;

    // public int solve(int i,int j){
    //     if(i==m-1 && j==n-1){
    //         return 1;
    //     }
    //     if(i<0||i>=m||j<0||j>=n){
    //         return 0;
    //     }
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }

    //     int right=solve(i,j+1);
    //     int down=solve(i+1,j);

    //     dp[i][j]=right+down;
    //     return dp[i][j];
    // }

    // public int uniquePaths(int m, int n) {
    //     this.m=m;
    //     this.n=n;
    //     dp=new int[m+1][n+1];
    //     for(int[] d:dp){
    //         Arrays.fill(d,-1);
    //     }
    //     return solve(0,0);
    // }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<m;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<n;i++){
            dp[0][i]=1;
        }
        dp[0][0]=1;
       for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
            dp[i][j]=dp[i-1][j]+dp[i][j-1];
        }
       }

       return dp[m-1][n-1];
    }
}