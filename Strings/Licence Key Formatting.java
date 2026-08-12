class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)) s2.append(Character.toUpperCase(c));

           else s2.append(c);
        }
        StringBuilder s1=new StringBuilder();
        for(int i=s2.length()-1;i>=0;i--){
            if(Character.isLetterOrDigit(s2.charAt(i))){
                s1.append(s2.charAt(i));
            }
        }
      //  System.out.println(s1);
        int idx=0;
        s2=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            s2.append(c);
            idx++;
            if(idx==k){
                s2.append("-");
                idx=0;
            }

        }
        System.out.println(s2);
        s1=new StringBuilder();
        for(int i=s2.length()-1;i>=0;i--){
            if(i==s2.length()-1 && s2.charAt(i)=='-') continue;
            else s1.append(s2.charAt(i));
        }
        
        return s1.toString();

        
    }
}
