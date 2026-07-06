class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> li=new ArrayList();
        for(int i=0;i<nums1.length;i++){
            li.add(nums1[i]);

        }
        List<Integer> ans=new ArrayList();
        for(int i=0;i<nums2.length;i++){
            if(li.contains(nums2[i])) {ans.add(nums2[i]); li.remove(Integer.valueOf(nums2[i]));}
        }
        int[] r=new int[ans.size()];
        for(int i=0;i<r.length;i++){
            r[i]=ans.get(i);
        }
        return r;
      
        
    }
}
