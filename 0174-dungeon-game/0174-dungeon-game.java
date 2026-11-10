// //Approach-1 - Brute Force (Binary Search on Answer) and also memoizing it - TLE
// //T.C : O(O(log(maxHealth) * m * n * maxHealth), total states in map = m * n * maxHealth
// //S.C : O(m * n * maxHealth)
// class Solution {
//     int m, n;
//     Map<String, Boolean> memo = new HashMap<>();

//     public boolean canSurvive(int i, int j, int[][] dungeon, int currHealth) {
//         if (i >= m || j >= n) return false;

//         currHealth += dungeon[i][j];
//         if (currHealth <= 0) 
//             return false;

//         if (i == m - 1 && j == n - 1) 
//             return true;

//         String key = i + "_" + j + "_" + currHealth;
//         if (memo.containsKey(key))
//             return memo.get(key);

//         boolean canReach = canSurvive(i + 1, j, dungeon, currHealth) ||
//                             canSurvive(i, j + 1, dungeon, currHealth);

//         memo.put(key, canReach);
//         return canReach;
//     }

//     public int calculateMinimumHP(int[][] dungeon) {
//         m = dungeon.length;
//         n = dungeon[0].length;

//         int left = 1, right = 4*(int)1e7;
//         int result = right;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             memo.clear();  // clear for new health level

//             if (canSurvive(0, 0, dungeon, mid)) {
//                 result = mid;
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }

//         return result;
//     }
// }


// //Approach-2 (Using Recursion and Memoization) - ACCEPTED
// //T.C : O(m*n)
// //S.C : O(m*n)
// class Solution {
//     int m, n;
//     int[][] t = new int[201][201];

//     public int solve(int i, int j, int[][] dungeon) {
//         if (i >= m || j >= n)
//             return (int)1e9;

//         if (t[i][j] != -1)
//             return t[i][j];

//         if (i == m - 1 && j == n - 1)
//             return t[i][j] = (dungeon[i][j] > 0 ? 1 : Math.abs(dungeon[i][j]) + 1);

//         int down  = solve(i + 1, j, dungeon);
//         int right = solve(i, j + 1, dungeon);

//         int res = Math.min(down, right) - dungeon[i][j];
//         return t[i][j] = (res > 0 ? res : 1);
//     }

//     public int calculateMinimumHP(int[][] dungeon) {
//         m = dungeon.length;
//         n = dungeon[0].length;
        
//         for (int[] row : t) {
//             Arrays.fill(row, -1);
//         }

//         return solve(0, 0, dungeon);
//     }
// }


//Approach-3 (Bottom Up) - ACCEPTED
//T.C : O(m*n)
//S.C : O(m*n)
class Solution {
    int m, n;

    public int calculateMinimumHP(int[][] dungeon) {
        m = dungeon.length;
        n = dungeon[0].length;
        //NOTE : We will write bottom up by traversing from bottom right to top left because 
        // when we find t[i][j] we must be already aware of the health for down (t[i+1][j) and right (t[i][j+1])
      
        int[][] t = new int[m][n];
        //t[i][j] = min health needed to reach (m-1, n-1) from (i,j)

        // Fill the rest of the DP table
        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                if (i == m - 1 && j == n - 1) {
                    t[i][j] = (dungeon[m - 1][n - 1] > 0 ? 1 : Math.abs(dungeon[m - 1][n - 1]) + 1);
                } else {
                    int down = (i + 1 >= m) ? (int)1e9 : t[i + 1][j];  // Health needed if moving down
                    int right = (j + 1 >= n) ? (int)1e9 : t[i][j + 1]; // Health needed if moving right
                    int res = Math.min(down, right) - dungeon[i][j];  // Calculate the required health

                    // If the result is <= 0, we need at least 1 health
                    t[i][j] = (res > 0 ? res : 1);
                }
            }
        }

        // The result is the minimum health required to start at the top-left corner
        return t[0][0];
    }
}