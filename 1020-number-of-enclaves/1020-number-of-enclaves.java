class Solution {
    public void bdfs(int[][] grid,int row ,int col){
        if(row<0 || col<0 ||row>=grid.length || col>=grid[0].length || grid[row][col]==0){
            return;
        }

        grid[row][col]=0;
        bdfs(grid,row-1,col);
        bdfs(grid,row,col+1);
        bdfs(grid,row+1,col);
        bdfs(grid,row,col-1);
    }
    public int dfs(int[][] grid,int row ,int col){
        if(row<0 || col<0 ||row>=grid.length || col>=grid[0].length || grid[row][col]==0){
            return 0;
        }

        grid[row][col]=0;
        int ans=1;
        ans+=dfs(grid,row-1,col);
        ans+=dfs(grid,row,col+1);
        ans+=dfs(grid,row+1,col);
        ans+=dfs(grid,row,col-1);

        return ans;
    }

    public int numEnclaves(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;

 // Top and bottom boundaries
        for (int j = 0; j < n; j++) {
            if (grid[0][j] == 1) {
                bdfs(grid, 0, j);
            }

            if (grid[m - 1][j] == 1) {
                bdfs(grid, m - 1, j);
            }
        }

        // Left and right boundaries
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) {
                bdfs(grid, i, 0);
            }

            if (grid[i][n - 1] == 1) {
                bdfs(grid, i, n - 1);
            }
        }
        int res=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    res+=dfs(grid,i,j);
                }
            }
        }

        return res;
        
    }
}