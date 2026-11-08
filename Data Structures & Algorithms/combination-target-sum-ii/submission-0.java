class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        BackTrack(candidates,target,0,new ArrayList<>(),res);
        return res;
    }
    public void BackTrack(int[] candidates,int t,int start,List<Integer> curr,List<List<Integer>> res){
        if(t==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
            if(t<0) break;
            curr.add(candidates[i]);
            BackTrack(candidates,t-candidates[i],i+1,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}
