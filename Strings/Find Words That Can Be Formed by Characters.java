class Solution {
    public int countCharacters(String[] words, String chars) {
        char[] c=new char[26];
      
        for(int i=0;i<chars.length();i++){
            char ch=chars.charAt(i);
            c[ch-'a']++;
           
        }
        int to=0;
        for(String e:words){
            char[] t=new char[26];
            for(int i=0;i<e.length();i++){
                t[e.charAt(i)-'a']++;
            }
            boolean b=true;
            for(int i=0;i<26;i++){
                if(c[i]<t[i]) {
                    b=false;
                    break;
                }

            }
            if(b) to+=e.length();
        }
        return to;
        
    }
}
