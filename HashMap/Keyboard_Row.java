class Solution {
    public String[] findWords(String[] words) {
        int[] Ist=  {0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,1,1,1,0,1,1,0,1,0,1,0};
        int[] IInd= {1,0,0,1,0,1,1,1,0,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0};
        int[] IIIrd={0,1,1,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,1,0,1,0,1};
        List<String> li=new ArrayList();
        for(int i=0;i<words.length;i++){
            String s=words[i].toLowerCase();
            int c=0;
            for(int j=0;j<s.length();j++){
               if(Ist[s.charAt(j)-'a']>0) c++;
               else break;
            }
            if (c==s.length()) li.add(words[i]);
            c=0;
            for(int j=0;j<s.length();j++){
               if(IInd[s.charAt(j)-'a']>0) c++;
               else break;
            }
            if (c==s.length()) li.add(words[i]);
            c=0;
            for(int j=0;j<s.length();j++){
               if(IIIrd[s.charAt(j)-'a']>0) c++;
               else break;
            }
            if (c==s.length()) li.add(words[i]);

            
        }
       
        String[] str=new String[li.size()];
      int  c=0;
        for(String e: li) str[c++]=e;
        return str;
        
    }
}
