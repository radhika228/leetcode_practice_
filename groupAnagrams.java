//leetcode 49
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            int[] count = new int [26];

            for(int j = 0;j<s.length();j++){
                char ch = s.charAt(j);
                int index=ch-'a';
                count[index]=count[index]+1;

            }
            String key=" ";
            for(int k =0;k<26;k++){
                key=key+"#"+count[k];
            }
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                List<String>list = new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
        }
        List<List<String>> result =  new ArrayList<>();
        Object[]keys = map.keySet().toArray();

        for(int i =0;i<keys.length;i++){
            String key = (String)keys[i];
            result.add(map.get(key));

        }
        return result;
    }
}