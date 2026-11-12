class Solution {
    public int inc(int[] nums){
        int count=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j-1]<nums[j]){
                    count++;
                }else{
                    break;
                }
            }
            max=Math.max(max,count);
        }

        return max;
        
    }
    public int dec(int[] nums){
        int count=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j-1]>nums[j]){
                    count++;
                }else{
                    break;
                }
            }
            max=Math.max(max,count);
        }

        return max;
        
    }
   
    public int longestMonotonicSubarray(int[] nums) {
        return Math.max(inc(nums),dec(nums));
    }
}