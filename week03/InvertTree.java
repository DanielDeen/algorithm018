/**
 * @description: 反转二叉树
 * @author: Daniel
 * @create: 2020-11-03
 */

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        // 自己一开始没有想到，需要加升一下
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        root.left = left;
        root.right = right;
        return root;
    }
}
