class Solution {
    public int[] getConcatenation(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for(int ele:nums){
            res.add(ele);
        }
        for(int ele:nums){
            res.add(ele);
        }

        int ans[]=new int[res.size()];

        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }

        return ans;
    }
}