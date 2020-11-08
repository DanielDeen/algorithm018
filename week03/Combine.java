import java.util.ArrayList;
import java.util.List;

/**
 * @description: 组合
 * @author: Daniel
 * @create: 2020-11-08
 */

public class Combine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        combineRes(res, new ArrayList<>(), 1, n, k);
        return res;
    }

    private void combineRes(List<List<Integer>> res, ArrayList<Integer> temp, int start, int n, int k) {
        if (k == 0) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = start; i <= n; i++) {
            temp.add(i);
            combineRes(res, temp, i + 1, n, k - 1);
            // 深度优先遍历的时候，需要逆向操作（这步不能理解时，可以debug搞清楚）
            temp.remove(temp.size() - 1);
        }
    }
}
