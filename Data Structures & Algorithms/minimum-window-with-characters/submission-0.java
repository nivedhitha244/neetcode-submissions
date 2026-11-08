class Solution {
    public String minWindow(String s, String t) {
        int s1=s.length();
        int t1=t.length();
        if(t1>s1) return "";
        int left=0;
        int formed=0;
        int min=Integer.MAX_VALUE;
        int[] freq1=new int[128];
        int[] freq2=new int[128];
        for(int i=0;i<t1;i++){
            freq2[t.charAt(i)]++;
        }
        int start=0;
        for(int right=0;right<s1;right++){
            freq1[s.charAt(right)]++;
            if(freq1[s.charAt(right)]<=freq2[s.charAt(right)]){
                formed++;
            }
            while(formed==t1){
                if(right-left+1<min){
                    min=right-left+1;
                    start=left;
                }
                char remove=s.charAt(left);
                freq1[remove]--;
                if(freq1[remove]<freq2[remove]){
                    formed--;
                }
                left++;
            }
        }
        if(min==Integer.MAX_VALUE) return "";
        return s.substring(start,min+start);
    }
}
