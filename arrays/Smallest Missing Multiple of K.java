class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> li=new ArrayList();
        for(int i=0;i<nums.length;i++){
            li.add(nums[i]);
        }
        int m=1;
        while(true){
            if(li.contains(m)){
                m++;
                continue;
            }
            else{
                if(m%k==0) return m;
                else m++;
            }

        }
       
        
    }
}
