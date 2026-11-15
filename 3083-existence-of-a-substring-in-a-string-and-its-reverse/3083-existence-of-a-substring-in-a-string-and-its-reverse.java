class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder sb=new StringBuilder(s);
        String rev= sb.reverse().toString();
        int n=s.length();

        for(int i=0;i<n-1;i++){
            if(rev.contains(s.substring(i,i+2))){
                return true;
            }
        }
        return false;
    }
}