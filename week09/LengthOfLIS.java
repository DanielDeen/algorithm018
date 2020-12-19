/**
 * @description: 300.最长递增子序列
 * @author: Daniel
 * @create: 2020-12-18
 */

public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;

        int[] dp = new int[nums.length];
        dp[0] = 1;
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            // j的定义 j<i
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            res = Math.max(res, dp[i]);
        }

        return res;
    }
}
