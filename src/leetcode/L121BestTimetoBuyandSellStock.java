package leetcode;

public class L121BestTimetoBuyandSellStock {

    public int maxProfit(final int[] prices) {
        if (prices.length < 2) return 0;
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
    }
}
