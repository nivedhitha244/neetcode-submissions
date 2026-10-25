class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash=new int[26];
        int maxf=0;
        int left=0;
        int right=0;
        int maxlen=0;
        while(right<s.length()){
            hash[s.charAt(right)-'A']++;
            maxf=Math.max(maxf,hash[s.charAt(right)-'A']);
            int changes=(right-left+1)-maxf;
            if(changes>k){
                hash[s.charAt(left)-'A']--;
                maxf=0;
                for(int i=0;i<26;i++){
                    maxf=Math.max(maxf,hash[i]);
                }
                left++;
            }
            if(changes<=k){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
        }
        return maxlen;
    }
}
