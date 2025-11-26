//leetcode 169
public class majorityElement {

    
    public static int majority(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;te
            }
        }

        return candidate;
    }


    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        int ans = majority(arr);

        System.out.println("Majority Element is: " + ans);
    }
}

