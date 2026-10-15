class Solution {
    public int sumCounts(List<Integer> nums) {
        HashSet<Integer> s=new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                if(!s.contains(nums.get(j))){
                    s.add(nums.get(j));
                }
                sum+=s.size()*s.size();
            }
            s.clear();
        }
        return sum;
    }
}