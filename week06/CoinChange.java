import java.util.Arrays;

/**
 * @description: 零钱兑换
 * @author: Daniel
 * @create: 2020-11-24
 */

public class CoinChange {
    int min = Integer.MAX_VALUE;

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        Arrays.sort(coins);
        countCoin(coins, amount, coins.length - 1, 0);
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    private void countCoin(int[] coins, int amount, int index, int count) {
        if (amount == 0) {
            min = Math.min(min, count);
            return;
        }
        if (index < 0) return;
        for (int i = amount / coins[index]; i >= 0 && i + count < min; i--) {
            countCoin(coins, amount - i * coins[index], index -1, count + i);
        }

    }
}
