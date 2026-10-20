/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Integer, Integer> mp = new HashMap<>();

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);

        int sum = root.val + left + right;

        mp.put(sum, mp.getOrDefault(sum, 0) + 1);

        return sum;
    }

    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        dfs(root);
        int maxfreq = 0;

        for (int f : mp.values()) {
            maxfreq = Math.max(maxfreq, f);
        }

        List<Integer> l = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
            if (e.getValue() == maxfreq) {
                l.add(e.getKey());
            }

        }

        int[] ans = new int[l.size()];

        for (int i = 0; i < l.size(); i++) {
            ans[i] = l.get(i);
        }

        return ans;

    }
}