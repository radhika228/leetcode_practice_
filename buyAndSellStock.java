//leetcode 121
 public class buyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];

            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            } else {
                int profit = currentPrice - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}