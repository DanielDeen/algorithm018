import java.util.List;
import java.util.ArrayList;

/**
 * @description: 二叉树的中序遍历
 * @author: Daniel
 * @create: 2020-10-31
 */
public class InorderTraversal {
    /**
     *  递归经典模板：（中序）
     *  if (root == null) return;
     *  inorder(root.left)
     *  res.add(root.val)
     *  inorder(root.right)
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root, res);

        return res;
    }

    public void inOrder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        inOrder(root.left, res);
        res.add(root.val);
        inOrder(root.right, res);
    }
    /**
     * 栈的方式实现：
     *
     */
}