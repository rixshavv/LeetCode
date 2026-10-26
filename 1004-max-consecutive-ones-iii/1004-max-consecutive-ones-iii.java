class Solution {
    public int longestOnes(int[] nums, int k) {
        int ws=0;
        int we=0;
        int n=nums.length;
        int zeros=0;
        int len=0;
        int maxlen=Integer.MIN_VALUE;

        //Bruteforce

        // while(we<n){
        //     while(we<n && (nums[we]==1||val>0)){
        //         if(nums[we]==1){
        //             we++;
        //         }else{
        //             we++;
        //             val--;
        //         }
        //     }
        //     len=we-ws;
        //     val=k;
        //     maxlen=Math.max(len,maxlen);
        //     ws++;
        //     we=ws;

        // }
        // return maxlen;

        while(we<n){
            if(nums[we]==0){
                zeros++;
            }

            while(zeros>k){
                if(nums[ws]==0){
                    zeros--;
                }
                ws++;
            }
            len=we-ws+1;
            maxlen=Math.max(maxlen,len);
            we++;
        }

        return maxlen;
    }
}