class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> res=new ArrayList<>();

        for(int i=nums.length-1;i>=0;i--){
            int ele=nums[i];
            while(ele!=0){
                int digit=ele%10;
                res.add(digit);
                ele/=10;
            }
        }
        Collections.reverse(res);
        int[] r = res.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return r;
        
    }
}