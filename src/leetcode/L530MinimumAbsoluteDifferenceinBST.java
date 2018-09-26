package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by leo on 9/24/18.
 */
public class L530MinimumAbsoluteDifferenceinBST {

    List<Integer> list;
    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(final TreeNode root) {
        list = new LinkedList<>();
        min = Integer.MAX_VALUE;
        inOrder(root);
        return min;
    }

    void inOrder(final TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        if (list.size() > 0) {
            min = Math.min(min, Math.abs(root.val - list.get(list.size() - 1)));
        }
        list.add(root.val);
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
