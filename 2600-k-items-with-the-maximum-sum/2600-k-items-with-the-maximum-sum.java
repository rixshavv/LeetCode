class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        while(k!=0){
            while(numOnes>0){
                sum+=1;
                numOnes--;
                k--;
                if(k==0){
                    return sum;
                }
            }
             while(numZeros>0){
                sum+=0;
                numZeros--;
                k--;
                if(k==0){
                    return sum;
                }
            }
             while(numNegOnes>0){
                sum-=1;
                numNegOnes--;
                k--;
                if(k==0){
                    return sum;
                }
            }
        }
        return sum;
    }
}