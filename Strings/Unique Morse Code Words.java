class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String>s=new HashSet();
        String[] c={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       
        for(String e:words){
             StringBuilder sb=new StringBuilder();
            for(int i=0;i<e.length();i++){
                sb.append(c[e.charAt(i)-'a']);

            }
            s.add(sb.toString());
        }
        return s.size();
        
    }
}
