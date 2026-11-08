class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        generate(n,0,0,"",res);
        return res;
    }
    public void generate(int n,int open,int close,String curr,List<String> res){
    if(open==n && close==n){
        res.add(curr);
        return;
    }
    if(open<n){
        generate(n,open+1,close,curr+"(",res);
    }
    if(close<open){
        generate(n,open,close+1,curr+")",res);
    }
    }
}
