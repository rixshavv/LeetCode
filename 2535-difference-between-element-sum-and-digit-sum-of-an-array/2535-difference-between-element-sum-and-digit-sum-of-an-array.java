class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitsum=0;
        
         for(int i=nums.length-1;i>=0;i--){
            int ele=nums[i];
            sum+=ele;
            while(ele!=0){
                int digit=ele%10;
                digitsum+=digit;
                ele/=10;
            }
        }

        return Math.abs(digitsum-sum);
    }
}