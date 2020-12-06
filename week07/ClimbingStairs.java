/**
 * @description: 爬楼梯
 * @author: Daniel
 * @create: 2020-12-01
 */

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        int res = 0;
        int preStep = 1;
        int preStepPre = 1;
        for (int i = 1; i < n; i++) {
            res = preStep + preStepPre;
            preStepPre = preStep;
            preStep = res;
        }
        return res;
    }
}
