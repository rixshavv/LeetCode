class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        Arrays.sort(nums);

        int n=nums.length;
        int median=nums[n/2];
        int move=0;

        for(int i=0;i<n;i++){
            move+=Math.abs(nums[i]-median);
        }
        return move;

    }
}