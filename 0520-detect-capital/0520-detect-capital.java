class Solution {
    public boolean detectCapitalUse(String word) {
        int capIdx=0;


        if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()) || ((word.substring(0,1).equals(word.substring(0,1).toUpperCase())) && word.substring(1).equals(word.substring(1).toLowerCase()))){
            return true;
        }
        return false;
    }
}