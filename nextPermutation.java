//leetcode 31
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx!=-1){
            for(int i =n-1; i>idx; i--){
                if(nums[i]>nums[idx]){
                    int temp= nums[i];
                    nums[i]= nums[idx];
                    nums[idx]= temp;
                    break;
                }
            }
        }
        int start = idx+1, end= n-1;
        while(start<end){
            int temp= nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;

        }
    }
}