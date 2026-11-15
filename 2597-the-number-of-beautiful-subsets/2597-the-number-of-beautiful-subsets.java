class Solution {
    int count=0;

    public void solve(int[] nums, int k,int start,List<Integer> l){
        

       // Set<Integer> s=new HashSet<>();

        for(int i=start;i<nums.length;i++){
            // if(s.contains(nums[i])){
            //     continue;  // avoid duplicates
            // }

            boolean valid=true;
            for(int j=0;j<l.size();j++){  //sbko check karna tha isliye forloop
                if(Math.abs(l.get(j)-nums[i])==k){
                    valid=false;
                    break;
                }
            }

            if(!valid){
                continue;
            }

           // s.add(nums[i]);
            l.add(nums[i]);

            count++;
            solve(nums,k,i+1,l);

            l.remove(l.size()-1);
        }
    }
    public int beautifulSubsets(int[] nums, int k) {
        solve(nums,k,0,new ArrayList<>());
        return count;
    }
}