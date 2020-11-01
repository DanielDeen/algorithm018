import java.util.ArrayList;
import java.util.List;

/**
 * @description: 二叉树的前序遍历
 * @author: Daniel
 * @create: 2020-10-31
 */
public class PreorderTraversal {
    /**
     *  递归经典模板：（前序）
     *  if (root == null) return;
     *  res.add(root.val)
     *  preorder(root.left)
     *  preorder(root.right)
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root, res);

        return res;
    }

    public static void preOrder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        preOrder(root.left, res);
        preOrder(root.right, res);
    }
}