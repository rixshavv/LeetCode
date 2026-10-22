class Solution {
    public int repeatedNTimes(int[] nums) {
       int n=nums.length/2;
       HashMap<Integer,Integer> mp=new HashMap<>();
       for(int ele:nums){
            mp.put(ele,mp.getOrDefault(ele,0)+1);
            if(mp.get(ele)==n){
                return ele;
            }
       }

       return -1;
       

       
    }
}