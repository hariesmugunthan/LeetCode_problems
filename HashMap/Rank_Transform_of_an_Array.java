class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[]a=arr.clone();
        Arrays.sort(a);
        Map<Integer,Integer> m= new HashMap();
        int r=1;
        for(Integer e:a){
            if(!m.containsKey(e)) m.put(e,r++);
        }
       // for(Map.Entry<Integer,Integer> e:m.entrySet()){System.out.println(e.getKey()+" "+e.getValue());} 
        for(int i=0;i<arr.length;i++){
            a[i]=m.get(arr[i]);
        }
        return a;

        
    }
}
