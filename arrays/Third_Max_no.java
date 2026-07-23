class Solution {
    public int thirdMax(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        List<Integer> li=new ArrayList();
        for(int e:nums){
            if(li.contains(e)) continue;
            else li.add(e);
        }
        System.out.println(Arrays.toString(nums));
        if(li.size()>=3)return  li.get(2);
        else return li.get(0);
        
    }
}
