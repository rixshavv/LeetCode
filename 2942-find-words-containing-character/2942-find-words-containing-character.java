class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            for(char ch:word.toCharArray()){
                if(ch==x){
                    l.add(i);
                    break;
                }
            }
        }

        // return l.stream().mapToInt(Integer::intValue).toArray();
        return l;
    }
}