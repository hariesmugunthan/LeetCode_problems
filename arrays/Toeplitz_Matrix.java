class Solution {
    public boolean isToeplitzMatrix(int[][] m) {

        for(int i=0;i<m[0].length;i++){
            int v=m[0][i];
            int c=i;
            int r=0;
            while(c<m[0].length && r<m.length){
                if(v!=m[r++][c++]) return false;

            }
             

        }
        for(int i=1;i<m.length;i++){
            int v=m[i][0];
            int c=0;
            int r=i;
             while(c<m[0].length && r<m.length){
                if(v!=m[r++][c++]) return false;

            }

        }
        return true;
        
    }
}
