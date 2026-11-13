class Solution {
    List<Integer> l = new ArrayList<>();
    Set<Integer> s = new HashSet<>();

    public void solve(int[] digits) {
        if (l.size() == 3) {
            int a = digits[l.get(0)];
            int b = digits[l.get(1)];
            int c = digits[l.get(2)];

            if (a != 0 && c % 2 == 0) {
                int num = a * 100 + b * 10 + c;
                s.add(num);
            }

            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if (l.contains(i)) {
                continue;
            }
            l.add(i);
            solve(digits);
            l.remove(l.size() - 1);

        }
    }

    public int totalNumbers(int[] digits) {
        solve(digits);
        return s.size();
    }
}