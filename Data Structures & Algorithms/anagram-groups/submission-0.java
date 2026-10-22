class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(map.containsKey(key)){
                List<String> list=map.get(key);
                list.add(word);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(word);
                map.put(key,list);
            }
        }
        List<List<String>> res=new ArrayList<>();
        res.addAll(map.values());
        return res;
    }
}
