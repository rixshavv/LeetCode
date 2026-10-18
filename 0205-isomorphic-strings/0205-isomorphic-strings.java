class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mp=new HashMap<>();
        HashMap<Character,Character> tp=new HashMap<>();


       for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);

            if(mp.containsKey(a) && mp.get(a)!=b){
                return false;
            }
            if(tp.containsKey(b) && tp.get(b)!=a){
                return false;
            }

            mp.put(a,b);
            tp.put(b,a);
       }
       return true;

    }
}