package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L144BinaryTreePreorderTraversal {

    List<Integer> res;

    public List<Integer> preorderTraversal1(final TreeNode root) {
        res = new ArrayList();
        preorder(root);
        return res;
    }

    void preorder(final TreeNode root) {
        if (root == null) return;
        res.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public List<Integer> preorderTraversal2(final TreeNode root) {
        res = new ArrayList();
        final Stack<TreeNode> stack = new Stack();
        if(root==null) return res;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
        return res;
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
