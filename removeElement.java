
//leetcode27
class removeElement{
    public static int valueReturn (int[]nums, int value) {
int k=0;
for(int i=0;i<nums.length;i++){
    if(nums[i]!=value){
        nums[k]=nums[i];//k is a index value
        k++;
    }
}
    return k;
}
public static void main(String[] args) {
    

    int[] nums ={3,2,2,3};
    int value=3;
    int newLength= valueReturn(nums, value);
    System.err.println("New length ="+newLength);
    System.out.println("Array after removing value:");
    for(int i=0;i<newLength;i++){
    System.out.println(nums[i]+" ");
    }
    
}
}
