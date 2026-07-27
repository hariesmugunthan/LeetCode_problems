class Solution {
    public int calPoints(String[] op) {
        int[] arr=new int[op.length];
        int idx=0;
        for(int i=0;i<op.length;i++){
            if(op[i].equals("+")){
                arr[idx]=arr[idx-1]+arr[idx-2];
                idx++;

            }else if(op[i].equals("D")){
                arr[idx]=arr[idx-1]*2;
                idx++;

            }else if(op[i].equals("C")){
                idx--;
                arr[idx]=0;

            }else{
                arr[idx++]=Integer.valueOf(op[i]);

            }

        }
        System.out.println(Arrays.toString(arr));
        idx=0;
        for(int i=0;i<arr.length;i++){
            idx+=arr[i];
        }

        return idx;
        
    }
}
