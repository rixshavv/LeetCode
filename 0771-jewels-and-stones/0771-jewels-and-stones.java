class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        List<Character> l=new ArrayList<>();
        for(char ch:jewels.toCharArray()){
            l.add(ch);
        }
        int count=0;
        for(char ch:stones.toCharArray()){
            if(l.contains(ch)){
                count++;
            }
        }

        return count;
    }
}