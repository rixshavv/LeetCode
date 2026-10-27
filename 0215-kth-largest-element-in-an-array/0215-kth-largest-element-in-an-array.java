class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:nums){
            pq.offer(ele);
        }
        while(!pq.isEmpty() && k!=1){
            pq.poll();
            k--;
        }

        int kthlargest=(!pq.isEmpty()) ?pq.poll():0;

        return kthlargest;

    }
}