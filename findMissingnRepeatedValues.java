//leetcode 2965

import java.util.HashSet;

public class findMissingnRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int total=n*n;

        long expectedSum=(long)total*(total+1)/2;
        long actualSum=0;
        long setSum=0;
        HashSet<Integer>set=new HashSet<>();
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=grid[i][j];
                actualSum+=num;
                if(!set.contains(num)){
                    setSum+=num;
                    set.add(num);

                }}
        }
        int duplicate=(int)(actualSum-setSum);
        int missing=(int)(expectedSum-setSum);
        return new int[]{duplicate,missing};

            }
        }

        
    


