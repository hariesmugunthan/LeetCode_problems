class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack();
        for(int i=0;i<s.length();i++){
            if(i==0){
                st.push(s.charAt(i));
                continue;
            } 
           if(!st.isEmpty() && s.charAt(i)==st.peek()) st.pop();
            else st.push(s.charAt(i));
        }
        List<Character>li=new ArrayList();

       while(!st.isEmpty()){
            li.add(st.pop());
       }
       String str="";
       for(int i=li.size()-1;i>=0;i--){
        str+=li.get(i);
       }
        return str;
        
    }
}
