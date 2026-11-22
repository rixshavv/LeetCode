class Solution {
    public boolean checkString(String s) {
        int aidx=s.lastIndexOf("a");
        int bidx=s.indexOf("b");
        if(bidx==-1){
            return true;
        }
        
        return (aidx<bidx)? true:false;
    }
}