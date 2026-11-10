class Solution {
   
    int [][]dp;
    int m;
    int n;

    public int solve(int[][] obstacleGrid,int i,int j){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i<0||i>=m||j<0||j>=n||obstacleGrid[i][j]==1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int right=solve(obstacleGrid,i,j+1);
        int down=solve(obstacleGrid,i+1,j);

        dp[i][j]=right+down;
        return dp[i][j];
    }

  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        this.m=obstacleGrid.length;
        this.n=obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        dp=new int[m+1][n+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return solve(obstacleGrid,0,0);
    }
}
