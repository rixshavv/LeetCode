class Solution {
    List<Integer> sublist=new ArrayList<>();
    List<List<Integer>> res=new ArrayList<>();

    public void solve(int[] nums,int start){
        if(sublist.size()>=2){
            res.add(new ArrayList<>(sublist));
        }

        Set<Integer> s=new HashSet<>();
        for(int i=start;i<nums.length;i++){
            if(s.contains(nums[i])){
                continue;
            }

            if(!sublist.isEmpty() && nums[i]<sublist.get(sublist.size()-1)){
                continue;  //bada lena hai chota aaya toh mt lo , 
            }
            s.add(nums[i]);

            sublist.add(nums[i]);

            solve(nums,i+1);

            sublist.remove(sublist.size()-1);

        }

    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        solve(nums,0);
        return res;  
    }
}