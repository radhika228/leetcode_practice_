//leetcode 136
class solution{
    public static singleNumber(int[] num){
        int ans=0;
        for(int i =0;i< nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}