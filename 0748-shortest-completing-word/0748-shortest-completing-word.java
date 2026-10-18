class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        Arrays.sort(words, Comparator.comparingInt(String::length));
        int[] lp = new int[26];
        int[] w = new int[26];

        String ans = "";

        for (int i = 0; i < licensePlate.length(); i++) {
            char ch = licensePlate.toLowerCase().charAt(i);
            if (Character.isLetter(ch)) {
                lp[ch - 'a']++;
            }
        }

        for (int j = 0; j < words.length;j++) {
            String word = words[j];

            for (char ch : word.toCharArray()) {
                w[ch - 'a']++;
            }
            boolean valid=true;
            for (int i = 0; i < 26; i++) {
                if (lp[i] > w[i]) { //same number or more
                    Arrays.fill(w, 0);
                    valid=false;
                    break;
                }
            }
            if(valid){
                return word;
            }
        }

        return "";

    }
}