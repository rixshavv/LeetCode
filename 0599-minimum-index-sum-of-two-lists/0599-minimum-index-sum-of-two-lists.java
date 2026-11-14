class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
      HashMap<String , Integer> mp=new HashMap<>();
      for(int i=0;i<list1.length;i++){
        mp.put(list1[i],i);
      }

      int minsum=Integer.MAX_VALUE;
      List<String> res=new ArrayList<>();
      int sum=0;

      for(int i=0;i<list2.length;i++){
            if(mp.containsKey(list2[i])){
                sum=mp.get(list2[i])+i;

                if(sum<minsum){
                    res.clear();
                    res.add(list2[i]);
                    minsum=sum;
                }else if(sum==minsum){
                    res.add(list2[i]);
                }
            }
      }

      return res.toArray(new String[0]);
    }
}