class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        BackTrack(nums,new ArrayList<>(),res);
        return res;
    }
    public void BackTrack(int[] nums,List<Integer> curr,List<List<Integer>> res){
        if(nums.length==curr.size()){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!curr.contains(nums[i])){
                curr.add(nums[i]);
                BackTrack(nums,curr,res);
                curr.remove(curr.size()-1);
            }
        }
    }
}
