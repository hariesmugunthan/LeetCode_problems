class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) return true;
        char[] arr=s.toCharArray();
        char g[]=goal.toCharArray();
        for(int i=1;i<arr.length;i++){
            char t=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=t;
            if(Arrays.equals(arr,g)) return true;

        }
        return false;

        
    }
}
