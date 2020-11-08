/**
 * @description: 二叉树的最近公共祖先
 * @author: Daniel
 * @create: 2020-11-08
 */
public class CommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return  root;

        TreeNode right = lowestCommonAncestor(root.right, p, q);
        TreeNode left = lowestCommonAncestor(root.left, p, q);

        if (right == null) return left;
        if (left == null) return right;

        return root;
    }
}