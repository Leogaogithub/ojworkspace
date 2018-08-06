package leetcode;

public class L100SameTree {

    public boolean isSameTree(final TreeNode p, final TreeNode q) {
        if (p == null || q == null) return p == q;
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
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
