// //Approach 1 - Recursion + Memoization
// //T.C : O(n^2) - Because the AMortized Time Complexity of solve() will become 1 due to memoization.
// //S.C : O(n^2)
// public class Solution {
//     private int[][] t;

//     public String longestPalindrome(String s) {
//         int n = s.length();
//         int maxlen = Integer.MIN_VALUE;
//         int startingIndex = 0;
//         t = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             Arrays.fill(t[i], -1);
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 if (solve(s, i, j) && j - i + 1 > maxlen) {
//                     startingIndex = i;
//                     maxlen = j - i + 1;
//                 }
//             }
//         }

//         return s.substring(startingIndex, startingIndex + maxlen);
//     }

//     private boolean solve(String s, int l, int r) {
//         if (l >= r) {
//             return true;
//         }

//         if (t[l][r] != -1) {
//             return t[l][r] == 1;
//         }

//         if (s.charAt(l) == s.charAt(r)) {
//             t[l][r] = solve(s, l + 1, r - 1) ? 1 : 0;
//         } else {
//             t[l][r] = 0;
//         }

//         return t[l][r] == 1;
//     }
// }


// //Approach 2 - Looping simply in solve()
// //T.C : O(n^3)
// public class Solution {
//     private boolean solve(String s, int l, int r) {
//         while (l <= r) {
//             if (s.charAt(l) != s.charAt(r))
//                 return false;
//             l++;
//             r--;
//         }
//         return true;
//     }

//     public String longestPalindrome(String s) {
//         int n = s.length();
//         int maxlen = Integer.MIN_VALUE;
//         int startingIndex = 0;

//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 if (solve(s, i, j)) {
//                     if (j - i + 1 > maxlen) {
//                         startingIndex = i;
//                         maxlen = j - i + 1;
//                     }
//                 }
//             }
//         }

//         return s.substring(startingIndex, startingIndex + maxlen);
//     }
// }


// //Approach 3 - Using Bottom Up (Elaborated for simplicity)
// //T.C : O(n^2)
// //S.C : O(n^2)
// public class Solution {
//     public String longestPalindrome(String s) {
//         int n = s.length();
//         int maxL = 0;
//         int index = 0;

//         boolean[][] t = new boolean[n][n];

//         // Every single character is a palindrome
//         for (int i = 0; i < n; i++) {
//             t[i][i] = true;
//             maxL = 1;
//             index = i;
//         }

//         // Check for palindromes of length 2
//         for (int i = 0; i < n - 1; i++) {
//             if (s.charAt(i) == s.charAt(i + 1)) {
//                 t[i][i + 1] = true;
//                 maxL = 2;
//                 index = i;
//             }
//         }

//         // Check for palindromes of length 3 or more
//         for (int L = 3; L <= n; L++) {
//             for (int i = 0; i < n - L + 1; i++) {
//                 int j = i + L - 1;

//                 if (s.charAt(i) == s.charAt(j) && t[i + 1][j - 1]) {
//                     t[i][j] = true;
//                     if (j - i + 1 > maxL) {
//                         maxL = j - i + 1;
//                         index = i;
//                     }
//                 }
//             }
//         }

//         return s.substring(index, index + maxL);
//     }
// }


//Approach 4 :  (Simplifiying Approach-2 above)
//Simplified solution
public class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] t = new boolean[n][n];
        int maxL = 1;
        int start = 0;

        for (int i = 0; i < n; i++) {
            t[i][i] = true;
        }

        for (int L = 2; L <= n; L++) {
            for (int i = 0; i < n - L + 1; i++) {
                int j = i + L - 1;

                if (s.charAt(i) == s.charAt(j) && (t[i + 1][j - 1] || L == 2)) {
                    t[i][j] = true;
                    if (L > maxL) {
                        maxL = L;
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + maxL);
    }
}