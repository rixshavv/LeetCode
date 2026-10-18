class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character,String> mp=new HashMap<>();
        String[] morse=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> set=new HashSet<>();

        StringBuilder sb=new StringBuilder();
        for(String word:words){
            for(char ch:word.toCharArray()){
                sb.append(morse[ch-'a']);
            }
            set.add(sb.toString());
            sb.setLength(0);
        }

        return set.size();

    }
}