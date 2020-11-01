import java.util.ArrayList;
import java.util.List;

/**
 * @description: 二叉树的后序遍历
 * @author: Daniel
 * @create: 2020-10-31
 */
public class PostorderTraversal {
    /**
     *  递归经典模板：（后序）
     *  if (root == null) return;
     *  postorder(root.left)
     *  postorder(root.right)
     *  res.add(root.val)
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postOrder(root, res);

        return res;
    }

    private void postOrder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        postOrder(root.left, res);
        postOrder(root.right, res);
        res.add(root.val);
    }
}