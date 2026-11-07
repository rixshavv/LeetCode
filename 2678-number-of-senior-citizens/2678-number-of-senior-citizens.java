class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        
        for(String d:details){
           int ele= Integer.parseInt(d.substring(11,13));
           System.out.print(ele);
           if(ele>60){
            count++;
           }
        }

        return count;
    }
}