/**
 * @description: 从前序与中序遍历序列中构造二叉树
 * @author: Daniel
 * @create: 2020-11-08
 */
public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length - 1, preorder, inorder);
    }

    private TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                index = i;
            }
        }
        root.left = helper(preStart + 1, inStart, index - 1, preorder, inorder);
        // 注意right 的 preStart
        root.right = helper(preStart + index - inStart + 1, index + 1, inEnd, preorder, inorder);
        return root;
    }
}
