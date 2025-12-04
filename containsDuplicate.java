//leetcode 217
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer>Map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(Map.contains(num)){
                return true;
            }
            else{
                Map.add(num);
            
            }

        }
        return false;
    }
}