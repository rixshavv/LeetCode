class Solution {
    List<Integer> res=new ArrayList<>();

    public void dfs(int curr, int n){
        res.add(curr);

        for(int i=0;i<=9;i++){
            int next=(curr*10)+i;

            if(next>n){
                break;
            }

                dfs(next,n);

        }
    }
    public List<Integer> lexicalOrder(int n) {

        for(int i=1;i<=9 && i<=n;i++){
            dfs(i,n);
        }

        return res;
        
    }
}