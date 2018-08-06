package leetcode;

public class L543DiameterofBinaryTree {

    int diameter = 0;

    public int diameterOfBinaryTree(final TreeNode root) {
        diameter = 0;
        help(root);
        return diameter;
    }

    public int help(final TreeNode node) {
        if (node == null) {
            return 0;
        }

        final int left = help(node.left);
        final int right = help(node.right);

        diameter = Math.max(diameter, left + right);
        return Math.max(left, right) + 1;
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
