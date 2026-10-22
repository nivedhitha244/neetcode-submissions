class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(list.contains(diff)){
                res[0]=list.indexOf(diff);
                res[1]=i;
                return res;
            }
            list.add(nums[i]);
        }
        return res;
    }
}
