class Solution {
    public double findMaxAverage(int[] nums, int k) {
    
     // double m=Double.NEGATIVE_INFINITY;
      double v=0;
      for(int i=0;i<k;i++) v+=nums[i];
     double m=v;
     // System.out.println(m);
      int l=0,r=k;
      for(int i=k;i<nums.length;i++){
        v-=nums[l];
        v+=nums[r];
      //  System.out.println(v);
        m=Math.max(m,v);
       // System.out.println(m);
        l++;
        r++;
       // System.out.println(l+" "+r);

      }
     
      
        return m/(double)k;
        
    }
}
