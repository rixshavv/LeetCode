class Solution {
    public boolean evendig(int num){
        int d=0;
        while(num!=0){
            num=num/10;
            d++;
        }
        if(d%2==0){
            return true;
        }
        return false;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(evendig(nums[i])){
                count++;
            }
        }
        return count;
    }
}