//leetcode 152
class maxProductSubarray {
    public int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int maxPro =nums[0];

        for(int i=1;i<nums.length;i++){
           int tempMax = Math.max(nums[i], Math.max(currMax*nums[i] , currMin*nums[i]));
           int tempMin = Math.min(nums[i], Math.min(currMax*nums[i] , currMin*nums[i]));
           currMax=tempMax;
           currMin=tempMin;
            maxPro = Math.max(maxPro,currMax);

        }
        return maxPro;
    }
}