class Solution {

    public String encode(List<String> strs) {
        String s="";
        for(int i=0;i<strs.size();i++){
            s+=strs.get(i).length()+"#"+strs.get(i);
        }
        return s;
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        int start=0;
        while(start<str.length()){
            int i=start;
            while(str.charAt(i)!='#'){
                i++;
            }
            int len=Integer.parseInt(str.substring(start,i));
            start=i+1;
            list.add(str.substring(start,start+len));
            start=start+len;
        }
        return list;
    }
}
