class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int ele:arr){
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        }
        HashSet<Integer> s=new HashSet<>();

        for(int val:mp.values()){
            if(s.contains(val)){
                return false;
            }
            s.add(val);
        }

        return true;
    }
}