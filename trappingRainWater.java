//leetcode 42s
public class trappingRainWater {
    public int trap(int[] height) {
        int left=0,right=height.length-1;
        int maxLeft=0,rightMax=0;
        int trappedWater=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=maxLeft){
                    maxLeft=height[left];
                }else{
                    trappedWater+=maxLeft-height[left];
                }
                left++;
                }
                else{
                    if(height[right]>=rightMax){
                        rightMax=height[right];
                    
                    }
                    else{
                        trappedWater+=rightMax-height[right];

                    }
                    right--;

                }
            }
            return trappedWater;
    }
}
    
