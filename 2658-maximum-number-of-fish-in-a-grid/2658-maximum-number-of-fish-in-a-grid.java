class Solution {
    public int dfs(int[][] grid , int row, int col){
        if(row<0 || col<0 || row>=grid.length || col>= grid[0].length || grid[row][col]==0){
            return 0;
        }
        int ans=grid[row][col];
        grid[row][col]=0;

        ans+=dfs(grid,row-1,col);
        ans+=dfs(grid,row,col+1);
        ans+=dfs(grid,row+1,col);
        ans+=dfs(grid,row,col-1);

        return ans;
    }
    public int findMaxFish(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int maxfish=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    int fish=dfs(grid,i,j);
                    maxfish=Math.max(fish,maxfish);
                }
            }
        }

        return maxfish;
        
    }
}