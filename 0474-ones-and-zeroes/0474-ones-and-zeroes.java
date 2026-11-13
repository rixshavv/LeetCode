
class Solution {
    int dp[][][];
    int length;

    public int noOfzero(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                count++;
            }
        }
        return count;
    }

    public int solve(String[] strs, int m, int n, int i) {

        // Base case
        if (i >= length) {
            return 0;
        }

        if (dp[i][m][n] != -1) {
            return dp[i][m][n];
        }

        String s = strs[i];
        int len = s.length();
        int zero = noOfzero(s);
        int ones = len - zero;

        // Skip
        int skip = solve(strs, m, n, i + 1);

        // Take
        int take = 0;
        if (zero <= m && ones <= n) {
            take = 1 + solve(strs, m - zero, n - ones, i + 1);
        }

        return dp[i][m][n] = Math.max(take, skip);
    }

    public int findMaxForm(String[] strs, int m, int n) {
        this.length = strs.length;
        dp=new int[length][m+1][n+1];
          for (int i = 0; i < length; i++) {
            for (int j = 0; j <= m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return solve(strs, m, n, 0);
    }
}
