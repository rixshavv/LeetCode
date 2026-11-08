class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> m1=new HashSet<>();
        HashSet<Integer> m2=new HashSet<>();

        for(int ele: nums1){
            m1.add(ele);
        }
        for(int ele: nums2){
            m2.add(ele);
        }

        int res[]=new int[2];
        int count=0;

        for(int i=0;i<nums1.length;i++){
            if(m2.contains(nums1[i])){
                count++;
            }
        }
        res[0]=count;
        count=0;
        for(int i=0;i<nums2.length;i++){
            if(m1.contains(nums2[i])){
                count++;
            }
        }
        res[1]=count;

        return res;

    }
}