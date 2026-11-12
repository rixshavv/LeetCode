// class Solution {
//     public int inc(int[] nums){
//         int count=0;
//         int max=Integer.MIN_VALUE;

//         for(int i=0;i<nums.length;i++){
//             count=1;
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[j-1]<nums[j]){
//                     count++;
//                 }else{
//                     break;
//                 }
//             }
//             max=Math.max(max,count);
//         }

//         return max;
        
//     }
//     public int dec(int[] nums){
//         int count=0;
//         int max=Integer.MIN_VALUE;

//         for(int i=0;i<nums.length;i++){
//             count=1;
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[j-1]>nums[j]){
//                     count++;
//                 }else{
//                     break;
//                 }
//             }
//             max=Math.max(max,count);
//         }

//         return max;
        
//     }
   
//     public int longestMonotonicSubarray(int[] nums) {
//         return Math.max(inc(nums),dec(nums));
//     }
// }


class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int inc = 1;
        int dec = 1;
        int max = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                inc++;
                dec = 1;
            }
            else if (nums[i] < nums[i - 1]) {
                dec++;
                inc = 1;
            }
            else {
                inc = 1;
                dec = 1;
            }

            max = Math.max(max, Math.max(inc, dec));
        }

        return max;
    }
}
