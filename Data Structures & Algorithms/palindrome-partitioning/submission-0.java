class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        BackTrack(s,0,new ArrayList<>(),res);
        return res;
    }
    public void BackTrack(String s,int ind,List<String> curr,List<List<String>> res){
        if(ind==s.length()){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=ind;i<s.length();i++){
            String str=s.substring(ind,i+1);
            if(check(str)){
                curr.add(str);
                BackTrack(s,i+1,curr,res);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean check(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        left++;
        right--;
        }
        return true;
    }
}
