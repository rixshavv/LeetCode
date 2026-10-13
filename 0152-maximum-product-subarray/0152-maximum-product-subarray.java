class Solution {
    public int maxProduct(int[] nums) {
        int maxprod = Integer.MIN_VALUE;
        int prod = 1;
        for (int ele : nums) {
            maxprod = Math.max(maxprod, ele);
        }
        for (int j = 0; j < nums.length; j++) {
            prod=1;
            for (int i = j; i < nums.length; i++) {
                prod *= nums[i];
                maxprod = Math.max(prod, maxprod);
            }
        }

        return maxprod;
    }
}