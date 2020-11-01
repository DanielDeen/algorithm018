import java.util.ArrayList;
import java.util.List;

/**
 * @description: N叉树的前序遍历
 * @author: Daniel
 * @create: 2020-10-31
 */

public class PreorderNTree {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root, res);
        return res;
    }

    public void preOrder(Node root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        for (Node node: root.children) {
            preOrder(node, res);
        }
    }
}