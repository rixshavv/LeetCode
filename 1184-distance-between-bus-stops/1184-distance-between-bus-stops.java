class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int totaldistance=0;
        int n=distance.length;
        int dist=0;
        for(int e:distance){
            totaldistance+=e;
        }

        for(int i=start;i!=destination;i=(i+1)%n){
            dist+=distance[i];
        }
        return Math.min(dist,totaldistance-dist);
    }
}