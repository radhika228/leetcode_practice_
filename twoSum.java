public class twoSum  {
    public int[] twokaSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();  // value -> index

        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];   // jo number chahiye
            if (map.containsKey(second)) {   // agar mil gaya
                return new int[] { map.get(second), i };  // dono indexes return
            }
            map.put(nums[i], i);   // current value ko map me daal do
        }

        return new int[] {};  // default return (compilers ke liye)
    }
}

