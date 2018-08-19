package leetcode;

public class L122BestTimetoBuyandSellStockII {

    public int maxProfit(final int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                result = result + prices[i + 1] - prices[i];
            }
        }
        return result;
    }
}
