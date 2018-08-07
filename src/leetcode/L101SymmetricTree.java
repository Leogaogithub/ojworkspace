package leetcode;

public class L101SymmetricTree {

    public boolean isSymmetric(final TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    boolean isMirror(final TreeNode node1, final TreeNode node2) {
        if (node1 == null || node2 == null) {
            return node1 == node2;
        }
        return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(final int x) {
            val = x;
        }
    }
}
