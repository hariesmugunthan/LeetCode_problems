class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> s= new HashSet<>();
        int[]arr =new int[2];
        int v=0;
        for(int i=0;i<nums.length;i++){
            if(!s.contains(nums[i])) s.add(nums[i]);
            else v=nums[i];
           

        }
        int t=(nums.length*(nums.length+1))/2;
        for(Integer e:s) t=t-e;
        arr[0]=v;
        arr[1]=t;
        return arr;
      
        
    }
}
