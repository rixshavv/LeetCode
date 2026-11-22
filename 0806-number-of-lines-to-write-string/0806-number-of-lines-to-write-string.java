class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int line=1;
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=widths[s.charAt(i)-'a'];
            if(sum>100){
                sum=widths[s.charAt(i)-'a'];
                line++;
            }
        }

        return new int[]{line,sum};
    }
}