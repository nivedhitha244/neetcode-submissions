class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        char[] str1=s1.toCharArray();
        Arrays.sort(str1);
        for(int i=0;i<=s2.length()-s1.length();i++){
            String s="";
            for(int j=i;j<i+s1.length();j++){
                s+=s2.charAt(j);
            }
            char[] str2=s.toCharArray();
            Arrays.sort(str2);
            if(Arrays.equals(str1,str2)){
                return true;
            }
        }
        return false;
    }
}
