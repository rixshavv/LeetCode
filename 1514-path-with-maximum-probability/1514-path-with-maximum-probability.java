class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        
        //dijkstra

        // A -Arraylistbanao
        List<List<double[]>> adjlist=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjlist.add(new ArrayList<>());
        }

        // B- Build the adjlist/graph

        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            double p=succProb[i];

            adjlist.get(u).add(new double[]{v,p});
            adjlist.get(v).add(new double[]{u,p});
        }

        // Distance array //here prob array

        double[] prob=new double[n];
        prob[start_node]=1.0;

        //priority queue (min heap /maxheap)
        PriorityQueue<double[]> pq=new PriorityQueue<>((a,b)->Double.compare(b[1],a[1]));


        //start node in pq and start while 
        pq.offer(new double[]{start_node,1.0});

        while(!pq.isEmpty()){
            double[] curr=pq.poll();
            int node=(int) curr[0];
            double currprob=curr[1];

            if(currprob<prob[node]){
                continue;
            }

            if(node==end_node){
                return currprob;
            }

            //all neighbour visit

            for(double[] neighbour: adjlist.get(node)){
                int nextnode=(int) neighbour[0];
                double edgeprob=neighbour[1];

                double newprob=currprob*edgeprob;

                if(newprob>prob[nextnode]){
                    prob[nextnode]=newprob;
                    pq.offer(new double[]{nextnode,newprob});
                }
            }

        }
        return 0.0;
    }
}