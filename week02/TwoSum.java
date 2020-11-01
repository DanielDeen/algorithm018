/**
 * @description: 两数之和
 * @author: Daniel
 * @create: 2020-10-31
 */

public class TwoSum {
    public static int[] twoSum2(int[] nums, int target) {
        // 利用Map记录数据
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                // 注意返回值顺序
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
