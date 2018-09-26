package leetcode;

/**
 * Created by leo on 9/24/18.
 */
public class L530MinimumAbsoluteDifferenceinBST2 {

    int min = Integer.MAX_VALUE;
    int pre = Integer.MAX_VALUE;
    boolean preLoad = false;

    public int getMinimumDifference(final TreeNode root) {
        min = Integer.MAX_VALUE;
        preLoad = false;
        inOrder(root);
        return min;
    }

    void inOrder(final TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        if (preLoad) {
            min = Math.min(min, Math.abs(root.val - pre));
        }
        preLoad = true;
        pre = root.val;
        inOrder(root.right);
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
