//leetcode 918
class circularKadane {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int currMax = 0, maxSum = Integer.MIN_VALUE;
        int currMin = 0, minSum = Integer.MAX_VALUE;

        for (int num : nums) {
            // normal Kadane (max)
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);

            // reverse Kadane (min)
            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);

            total += num;
        }

        // all numbers negative
        if (maxSum < 0) return maxSum;

        
        return Math.max(maxSum, total - minSum);
    }
}
