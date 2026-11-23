class Solution {
    public String largestEven(String s) {
        int i=0;
        int j=s.length()-1;

        while(i<=j  && (int)s.charAt(j)%2!=0){
            j--;
        }
        if(i>j){
            return "";
        }
        if(j==s.length()-1){
            return s;
        }
        return s.substring(i,j+1);
    }
}