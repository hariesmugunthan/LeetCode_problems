class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]) {
                c++;
                max=Math.max(max,c);

            }
            else c=1;

        }
        return max;

    }
}
