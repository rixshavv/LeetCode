class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> l=new ArrayList<>();

    public void dfs(int[] candidates,int target,int sum,int start){
        if(sum>target){
            return;
        }
        if(sum==target){
            res.add(new ArrayList<>(l));
            return;
        }
        Arrays.sort(candidates);
        int n=candidates.length;

        for(int i=start;i<candidates.length;i++){

            if(i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            l.add(candidates[i]);
            dfs(candidates,target,sum+candidates[i],i+1);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        dfs(candidates,target,0,0);

        return res;
        
    }
}