class Solution {
    public boolean isSubsequence(String s, String t) {
        int r=0,l=0;
        int ct=0;
        while(r<s.length() && l<t.length()){
            if(s.charAt(r)==t.charAt(l)){
                ct++;
                r++;
                l++;
            }
            if(r>=s.length() || l>=t.length()) break;
            while(l<t.length()&&r<s.length() && s.charAt(r)!=t.charAt(l)){
                l++;

            }
     


        }
          if(ct==s.length()){
                return true;
            }else return false;
        
    }
}
