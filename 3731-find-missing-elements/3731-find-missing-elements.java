class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        for(int e:nums){
            l.add(e);
        }
        Arrays.sort(nums);
        int start=nums[0];
        int end=nums[nums.length-1];

        for(int i=start;i<=end;i++){
            if(!l.contains(i)){
                res.add(i);
            }
        }

        return res;

    }
}