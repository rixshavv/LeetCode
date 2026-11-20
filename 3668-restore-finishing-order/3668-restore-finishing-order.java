class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> res=new ArrayList<>();
        List<Integer> flist=new ArrayList<>();
        for(int e:friends){
            flist.add(e);
        }

        for(int i=0;i<order.length;i++){
            if(flist.contains(order[i])){
                res.add(order[i]);
            }
        }
        int arr[]=res.stream().mapToInt(Integer::intValue).toArray();

        return arr;
        
    }
}