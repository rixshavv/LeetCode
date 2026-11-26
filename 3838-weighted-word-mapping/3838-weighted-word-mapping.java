class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int weight=0;
            for(int j=0;j<word.length();j++){
                weight+=weights[word.charAt(j)-'a'];
            }
            s.append((char)(122-(weight%26)));
        }

        return s.toString();
    }
}