import java.util.List;

/**
 * @description: 全排列
 * @author: Daniel
 * @create: 2020-11-08
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums);
        return res;
    }

    private void backtrack(List<List<Integer>> res, ArrayList<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backtrack(res, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}