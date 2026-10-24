class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        //matrix intialization
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(matrix[i], 10001);
            matrix[i][i] = 0;
        }

        //weights process
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            matrix[u][v] = w;
            matrix[v][u] = w;
        }

        //floyddwarshall
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][k] != 10001 && matrix[k][j] != 10001) {
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                }
            }
        }
        int mincount=Integer.MAX_VALUE;
        int res=-1;

        for(int i=0;i<n;i++){
            int count=0;

            for(int j=0;j<n;j++){
                if(i!=j && matrix[i][j]<=distanceThreshold){
                    count++;
                }
            }

            if(count<=mincount){
                mincount=count;
                res=i;
            }
        }
        return res;
    }
}