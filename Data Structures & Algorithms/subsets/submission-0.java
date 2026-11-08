class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        BackTrack(0,nums,new ArrayList<>(),res);
        return res;
    }
    public void BackTrack(int i,int[] nums,List<Integer> curr,List<List<Integer>> res){
        res.add(new ArrayList<>(curr));
        for(int start=i;start<nums.length;start++){
            curr.add(nums[start]);
            BackTrack(start+1,nums,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}
