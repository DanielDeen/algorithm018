import java.util.ArrayList;
import java.util.List;

/**
 * @description: 括号生成
 * @author: Daniel
 * @create: 2020-11-03
 */

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        int left = 0;
        int right = 0;
        getParenthesis(n, res, left, right, "");
        return res;
    }

    // 注意递归的方式
    private void getParenthesis(int n, List<String> res, int left, int right, String s) {
        if (left == n && right == n) {
            res.add(s);
            return;
        }
        if (left < n) getParenthesis(n, res, left + 1, right, s + "(");
        if (right < left) getParenthesis(n, res, left, right + 1, s + ")");
    }
}
