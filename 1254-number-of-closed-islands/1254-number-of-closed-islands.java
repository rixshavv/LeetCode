class Solution {
    public int closedIsland(int[][] grid) {
         int m=grid.length;
        int n=grid[0].length;

 // Top and bottom boundaries
        for (int j = 0; j < n; j++) {
            if (grid[0][j] == 0) {
                bdfs(grid, 0, j);
            }

            if (grid[m - 1][j] == 0) {
                bdfs(grid, m - 1, j);
            }
        }

        // Left and right boundaries
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                bdfs(grid, i, 0);
            }

            if (grid[i][n - 1] == 0) {
                bdfs(grid, i, n - 1);
            }
        }
        int res=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    dfs(grid,i,j);
                    res++;
                }
            }
        }

        return res;
        
    }
    public void bdfs(int[][] grid,int row ,int col){
        if(row<0 || col<0 ||row>=grid.length || col>=grid[0].length || grid[row][col]==1){
            return;
        }

        grid[row][col]=1;
        bdfs(grid,row-1,col);
        bdfs(grid,row,col+1);
        bdfs(grid,row+1,col);
        bdfs(grid,row,col-1);
    }
    public void dfs(int[][] grid,int row ,int col){
        if(row<0 || col<0 ||row>=grid.length || col>=grid[0].length || grid[row][col]==1){
            return ;
        }

        grid[row][col]=1;
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row+1,col);
        dfs(grid,row,col-1);

      
    }

   
}
