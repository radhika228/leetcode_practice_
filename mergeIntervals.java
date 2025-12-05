//leetcode 56
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals ,(a,b)->a[0]-b[0]);
        int n= intervals.length;
        int[][] ans=new int [n][2];
        int index=0;
        ans[index]=intervals[0];
        index++;
        for(int i=1;i<n;i++){
            int currStart = intervals[i][0];
            int currEnd =intervals[i][1];
            int lastEnd=ans[index-1][1];
            if(currStart<=lastEnd){
                ans[index-1][1] = Math.max(lastEnd , currEnd);
            }else{
                ans[index]= intervals[i];
                index++;
            }
            }
            int[][] result =new int [index][2];
            for(int i =0;i<index;i++){
                result[i]=ans[i];

            }
            return result;
        
        
    }
}