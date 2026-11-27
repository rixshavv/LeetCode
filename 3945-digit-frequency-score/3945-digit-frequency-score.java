class Solution {
    public int digitFrequencyScore(int n) {
       
        long score=0;
       while(n!=0){
        long digit=n%10;
        score+=digit;
        n/=10;
       }

       return (int)score;
      
    }
}