class Solution {
     List<List<String>> res = new ArrayList<>();
    List<String> l = new ArrayList<>();

    public void dfs(String s, int start) {
        if (start == s.length()) {
            res.add(new ArrayList<>(l));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                l.add(s.substring(start, i + 1));

                dfs(s, i + 1);

                l.remove(l.size() - 1);
            }
        }
    }
     public boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        dfs(s, 0);
        return res;

    }
}