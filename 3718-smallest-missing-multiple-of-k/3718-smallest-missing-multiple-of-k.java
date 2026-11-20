class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> l=new ArrayList<>();
        for(int e:nums){
            l.add(e);
        }

        int val=k;

        while(l.contains(val)){
            val+=k;
        }

        return val;
        
    }
}