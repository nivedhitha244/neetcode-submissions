class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.charAt(0)==')' || s.charAt(0)==']' || s.charAt(0)=='}'){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' ){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char ch=st.pop();
                if(ch=='(' && s.charAt(i)!=')' || ch=='{' && s.charAt(i)!='}' || ch=='[' && s.charAt(i)!=']') return false;
            }
        }
        return st.empty();
    }
}
