class Solution {
    class DisjointSet{
        int rank[];
        int parent[];
        int components;

        DisjointSet(int nodes){
            this.components=nodes;
            this.parent=new int[nodes];
            this.rank=new int[nodes];


            for(int i=0;i<nodes;i++){
                parent[i]=i;
                rank[i]=0;
            }
        }

        public int findparent(int node){
            if(node==parent[node]){
                return node;
            }
            parent[node]=findparent(parent[node]);
            return parent[node];
        }

        public void unionbyrank(int n1,int n2){
            int rp1=findparent(n1);
            int rp2=findparent(n2);

            if(rp1==rp2){
                return;
            }
            components--;
            if(rank[rp1]<rank[rp2]){
                parent[rp1]=rp2;
                rank[rp2]++;
            }else{
                parent[rp2]=rp1;
                rank[rp1]++;
            }
        }

    }
    public int minCost(int n, int[][] edges, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
        for(int[] edge : edges){
            pq.offer(edge);
        }
        int maxVal=0;
        DisjointSet dsu=new DisjointSet(n);

        while(!pq.isEmpty() && dsu.components>k){
            int[] edge=pq.poll();
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            maxVal=Math.max(maxVal,w);
            dsu.unionbyrank(u,v);
        }

        return maxVal;
    }
}