class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int idx=0;
        int maxone=0;
        int one=0;
        for(int i=0;i<mat.length;i++){
            one=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    one++;
                }
                if(maxone<one){
                    maxone=one;
                    idx=i;
                }
            }
        }

        return new int[]{idx,maxone};
    }
}