class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val=0;
        for(String a:operations){
            if(a.charAt(0)=='+' || a.charAt(a.length()-1)=='+'){
                val++;
            }else{
                val--;
            }
        }
        return val;
    }
}