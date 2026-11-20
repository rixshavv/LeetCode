class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] digit=new int[10];
        Arrays.fill(digit,Integer.MAX_VALUE);
        while(n>0){
            int d=n%10;
            if(digit[d]==Integer.MAX_VALUE){
                digit[d]=1;
            }else{
                digit[d]++;
            }
            n/=10;
        }

        int min=Integer.MAX_VALUE;
        int minele=0;
        for(int i=0;i<digit.length;i++){
            if(digit[i]<min){
                minele=i;
                min=digit[i];
            }
        }

        return minele;
    }
}