/**
 * @description: 跳跃游戏II
 * @author: Daniel
 * @create: 2020-11-14
 */

public class Jump {
    public int jump(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }

    public int jump2(int[] nums) {
        int currEnd = 0;
        int currFastest = 0;
        int steps = 0;

        for (int i = 0; i < nums.length -1; i++) {
            currFastest = Math.max(currFastest, i + nums[i]);
            if (i == currEnd) {
                steps++;
                currEnd = currFastest;
            }
        }

        return steps;

        return steps;
    }
}
