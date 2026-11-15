class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=1000000007; 
        long even=1 ; //empty prefix sum
        long odd=0;

        long ans=0;

        long prefixsum=0;

        for(int ele:arr){
            prefixsum+=ele;

            if(prefixsum%2==0){
                ans=(ans+odd)%mod;
                even++;
            }else{
                ans=(ans+even)%mod; //even+odd is odd
                odd++;
            }

        }

        return (int) ans;
    }
}