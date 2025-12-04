//leetcode 217
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer>Map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(Map.containsKey(num)){
                return true;
            }
            else{
                Map.put(num,1);
            
            }

        }
        return false;
    }
}