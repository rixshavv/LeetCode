class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        int[] freq=new int[26];
        for(char ch:sentence.toCharArray()){
            freq[ch-'a']++;
        }

        for(int ele:freq){
            if(ele<1){
                return false;
            }
        }

        return true;
    }
}