class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             if(Math.abs(i-j)<=k) return true;
        //         }
        //     }
        // }
        Map<Integer,Integer> li=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(li.containsKey(nums[i])){
                if(Math.abs(i-li.get(nums[i]))<=k) return true;
                else li.put(nums[i],i);
            }
            else li.put(nums[i],i);

        }
        return false;
        
    }
}
