class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        BackTrack(nums,target,0,new ArrayList<>(),res);
        return res;
    }
    public void BackTrack(int[] nums,int t,int start,List<Integer> curr,List<List<Integer>> res){
        if(t==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(t<0) break;
            curr.add(nums[i]);
            BackTrack(nums,t-nums[i],i,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}
