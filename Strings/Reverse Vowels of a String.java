class Solution {
    public String reverseVowels(String s) {
        char[] c=s.toCharArray();
        int l=0,r=s.length()-1;
        List<Character> li=Arrays.asList('a','A','e','E','i','I','o','O','u','U');
        while(l<r){

            while(!li.contains(c[l]) && l<r){
                l++;

            }
            while(!li.contains(c[r]) &&l<r){
                r--;
            }
            if(li.contains(c[l]) && li.contains(c[r]) ){
                char t=c[l];
                c[l]=c[r];
                c[r]=t;
                l++;r--;
            }
            
        }
        System.out.println(Arrays.toString(c));
        StringBuilder str=new StringBuilder();
        for(Character e:c) str.append(e);

        return str.toString();
        
    }
}
