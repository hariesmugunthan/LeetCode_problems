class Solution {
    public int smallestNumber(int n, int t) {
        int ans=0;
        boolean b=true;
        while(b){
            int v=n;
            int m=1;
            while(v!=0){
                m*=v%10;
                v/=10;

            }
            System.out.println(m);
            if(m%t==0) {ans=n; break;}
            else n+=1;
            
        }
        return ans;
        


        
    }
}
