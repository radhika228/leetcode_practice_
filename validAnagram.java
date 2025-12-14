//leetcode 242
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[26];

        for(int i=0;i<s.length();i++){
            char charS = s.charAt(i);
            char charT = s.charAt(i);

            count[charS-'a'] = count[charS-'a']+1;
            count[charT-'a'] = count[charT-'a']-1;
        }

            for(int i=0;i<count.length;i++){
                if(count[i]!=0){
                    return false;
                }
            }
            return true;
    }
}
    
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[26];

        for(int i=0;i<s.length();i++){
            char charS = s.charAt(i);
            char charT = s.charAt(i);

            count[charS-'a'] = count[charS-'a']+1;
            count[charT-'a'] = count[charT-'a']-1;
        }

            for(int i=0;i<count.length;i++){
                if(count[i]!=0){
                    return false;
                }
            }
            return true;
    }
}
    
