class Solution {
    public int maxRepeating(String sequence, String word) {
         int count = 0;
        StringBuilder sb = new StringBuilder();

        while (sb.length() + word.length() <= sequence.length()) {
            sb.append(word);

            if (sequence.contains(sb.toString())) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}