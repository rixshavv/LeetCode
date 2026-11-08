class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int dp[][]=new int[n+1][n+1];

        for(int i=0;i<n;i++){
            dp[i][i]=0;
        }

        for(int L=2;L<=n;L++){
            for(int i=0;i<n-L+1;i++){
                int j=i+L-1;

                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1];
                }else{
                    dp[i][j]=1+Math.min(dp[i][j-1],dp[i+1][j]);
                }
            }
        }

        return dp[0][n-1];

    }
}