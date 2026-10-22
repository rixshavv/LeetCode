class Solution {
    class DisjointSet{
        int components;
        int parent[];
        int rank[];

        DisjointSet(int nodes){
            this.components=nodes;
            this.parent=new int[nodes];
            this.rank=new int[nodes];

            //initialize arrays

            for(int i=0;i<nodes;i++){
                parent[i]=i;
                rank[i]=0;
            }
        }

        public int findrootparent(int u){
                if(u==parent[u]){
                    return u;
                }
                parent[u]=findrootparent(parent[u]);
                return parent[u];
        }
        public boolean unionbyrank(int node1,int node2){
            int rp1=findrootparent(node1);
            int rp2=findrootparent(node2);

            if(rp1==rp2){
                return false;
            }
            components--;
            if(rank[rp1]<rank[rp2]){
                parent[rp1]=rp2;
            }else if(rank[rp2]<rank[rp1]){
                parent[rp2]=rp1;
            }else{
                parent[rp2]=rp1;
                rank[rp1]++;
            }

            return true;
        }
    }
    public int findCircleNum(int[][] isConnected) {
        DisjointSet dsu=new DisjointSet(isConnected.length);
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1){
                    dsu.unionbyrank(i,j);
                }
            }
        }

        return dsu.components;

        
    }
}