class Solution {
    public int maxDistinct(String s) {
        Set<Character> set=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
          set.add(s.charAt(i));
        }
        return set.size();
    }
}