class Solution {
    public int findNonMinOrMax(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:nums){
            pq.offer(ele);
        }

        if(pq.size()<=2){
            return -1;
        }
        pq.poll();
        return pq.peek();
    }
}