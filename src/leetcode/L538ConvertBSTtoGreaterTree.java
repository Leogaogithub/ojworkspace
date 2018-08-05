package leetcode;

public class L538ConvertBSTtoGreaterTree {

    int sum = 0;

    public TreeNode convertBST(final TreeNode root) {
        if (root == null) return root;
        sum = 0;
        dfs(root);
        return root;
    }

    public void dfs(final TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.right);
        sum += node.val;
        node.val = sum;
        dfs(node.left);
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
