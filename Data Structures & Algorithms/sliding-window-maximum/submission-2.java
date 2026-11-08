class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ind=0;
        int[] arr=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        for(int right=0;right<n;right++){
            while(!dq.isEmpty() && dq.peekFirst()<=right-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[right]){
                dq.pollLast();
            }
            dq.offerLast(right);
            if(right>=k-1){
                arr[ind++]=nums[dq.peekFirst()];
            }
        }
        return arr;
    }
}
