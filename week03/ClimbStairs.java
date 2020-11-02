/**
 * @description: 爬楼梯
 * @author: Daniel
 * @create: 2020-11-02
 */

public class ClimbStairs {
    // 基于递归
    public int climbStairs1(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // 动态规划
    public int climbStairs2(int n) {
        if (n == 1 ) return 1;
        int first = 1;
        int second = 1;
        int res = 0;
        for (int i = 2; i < n; i++) {
            res = first + second;
            first = second;
            second = res;
        }

        return res;
    }
}

