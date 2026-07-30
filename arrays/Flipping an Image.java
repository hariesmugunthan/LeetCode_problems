class Solution {
    public int[][] flipAndInvertImage(int[][] ig) {
        int l=ig.length;
        int[][] a=new int[l][l];
        for(int i=0;i<l;i++){
            int k=0;
            for(int j=l-1;j>=0;j--){
                a[i][k]=ig[i][j];
                if(a[i][k]==0) a[i][k]=1;
                else a[i][k]=0;
                k++;

            }
        }
        return a;
        
    }
}
