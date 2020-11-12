/**
 * @description: 买卖股票的最佳时机II
 * @author: Daniel
 * @create: 2020-11-11
 */
public class MaxProfitII {
    public int maxProfit(int[] prices) {
        int profile = 0;
        for (int i = 1; i < prices.length; i++) {
            profile += Math.max(0 , prices[i] - prices[i-1]);
        }
        return profile;
    }
}
