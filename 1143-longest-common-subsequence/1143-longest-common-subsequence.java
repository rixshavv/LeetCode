// //Approach-1 (Recursion + Memoization)
// //T.C : O(m*n)
// //S.C : O(m*n)
// public class Solution {
//     private int[][] t;

//     public int LCS(String s1, String s2, int m, int n) {
//         if (m == 0 || n == 0)
//             return t[m][n] = 0;

//         if (t[m][n] != -1)
//             return t[m][n];

//         if (s1.charAt(m - 1) == s2.charAt(n - 1))
//             return t[m][n] = 1 + LCS(s1, s2, m - 1, n - 1);

//         return t[m][n] = Math.max(LCS(s1, s2, m, n - 1), LCS(s1, s2, m - 1, n));
//     }

//     public int longestCommonSubsequence(String text1, String text2) {
//         int m = text1.length();
//         int n = text2.length();

//         t = new int[m + 1][n + 1];
//         for (int[] row : t) {
//             Arrays.fill(row, -1);
//         }

//         return LCS(text1, text2, m, n);
//     }
// }


// //Approach-2 (Bottom Up)
// //T.C : O(m*n)
// //S.C : O(m*n)
// public class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         int m = text1.length();
//         int n = text2.length();
        
//         int[][] t = new int[m + 1][n + 1];
        
//         for (int i = 0; i < m + 1; i++) {
//             for (int j = 0; j < n + 1; j++) {
//                 if (i == 0 || j == 0) {
//                     t[i][j] = 0;
//                 } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
//                     t[i][j] = 1 + t[i - 1][j - 1];
//                 } else {
//                     t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
//                 }
//             }
//         }
        
//         return t[m][n];
//     }
// }



//Approach-3 (Bottom Up space optmized)
/*
Since, in bottm up approach, we are using results of only two rows, t[i] and t[i-1]. So, we can take only two rows.
*/
//T.C : O(m*n)
//S.C : O(n)
public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        int[][] t = new int[2][n+1];
        
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    t[i % 2][j] = 0;
                } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    t[i % 2][j] = 1 + t[(i + 1) % 2][j - 1];
                } else {
                    t[i % 2][j] = Math.max(t[i % 2][j - 1], t[(i + 1) % 2][j]);
                }
            }
        }
        
        return t[m % 2][n];
    }
}