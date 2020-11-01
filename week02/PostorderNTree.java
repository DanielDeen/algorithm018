import java.util.ArrayList;
import java.util.List;

/**
 * @description: N叉树的后序遍历
 * @author: Daniel
 * @create: 2020-10-31
 */

public class PostorderNTree {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        postOrder(root, res);
        return res;
    }

    public void postOrder(Node root, List<Integer> res) {
        if (root == null) return;
        for (Node node: root.children) {
            postOrder(node, res);
        }
        res.add(root.val);
    }
}