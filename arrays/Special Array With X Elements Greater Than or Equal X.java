class Solution {
    public int specialArray(int[] nums) {
        int x=nums.length;
        while(x>0){
            int c=0;
            for(int i=0;i<nums.length;i++){
                if(x<=nums[i])c++;
            }
            if(c==x) return x;
            x--;

        }
        return -1;
        
    }
}
