class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }


        String wordl=word.toLowerCase();
        int vowels=0;
        int cons=0;

        for(char ch:wordl.toCharArray()){
            if(ch=='$'||ch=='@'||ch=='#'){
                return false;
            }
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else if(Character.isLetter(ch)){
                cons++;
            }
        }
        if(vowels<1 || cons<1){
            return false;
        }

        return true;
    }
}