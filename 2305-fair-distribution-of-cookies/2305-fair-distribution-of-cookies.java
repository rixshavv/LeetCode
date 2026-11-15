class Solution {
    int res=Integer.MAX_VALUE;
    int n;

    public void solve(int idx, int[] cookies,int[] children,int k){
        if(idx==n){
            int ans=0;
            for(int c:children){
                ans=Math.max(ans,c);
            }

            res=Math.min(ans,res);
            return;
        }

        int candy=cookies[idx];

        for(int i=0;i<k;i++){
            children[i]+=candy;
            //explore
            solve(idx+1,cookies,children,k);

            children[i]-=candy;
        }
    }
    public int distributeCookies(int[] cookies, int k) {
        this.n=cookies.length;
        int [] children=new int[k];
        
        solve(0,cookies,children,k);
        return res;
    }
}