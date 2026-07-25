class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int idx=0;
        for(int i=0;i<nums.length;i++){ 
            if(max<nums[i]){
                max=nums[i];
                idx=i;
                

            }
        }
        System.out.println(max+" "+idx);
        for(int e:nums){
            if(  e!=max &&e+e>max) return -1;
          
        }
        
        return idx;
        
    }
}
