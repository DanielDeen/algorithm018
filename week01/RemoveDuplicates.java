
/**
 * @description: 删除排序数组中的重复项
 * @author: Daniel
 * @create: 2020-10-20
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int res = 0;
        int p = 1;
        while (p < nums.length) {
            if (nums[res] != nums[p]) {
                res++;
                nums[res] = nums[p];
            }
            p++;
        }
        return res + 1;
    }
}