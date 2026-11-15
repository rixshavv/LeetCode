class Solution {
    public int countKeyChanges(String s) {
        String sn=s.toLowerCase();
        int count=0;
       for(int i=1;i<sn.length();i++){
            if(sn.charAt(i)!=sn.charAt(i-1)){
                count++;
            }
       }

       return count;
       
    }
}