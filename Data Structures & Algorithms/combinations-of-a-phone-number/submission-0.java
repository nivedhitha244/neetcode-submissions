class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.length()==0) return res;
        BackTrack(digits,0,"",res);
        return res;
    }
    public void BackTrack(String digits,int ind,String curr,List<String> res){
        if(ind==digits.length()){
            res.add(curr);
            return;
        }
        String[] maps={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String adder=maps[digits.charAt(ind)-'0'];
        for(int i=0;i<adder.length();i++){
            curr=curr+adder.charAt(i);
            BackTrack(digits,ind+1,curr,res);
            curr=curr.substring(0,curr.length()-1);
        }
    }
}
