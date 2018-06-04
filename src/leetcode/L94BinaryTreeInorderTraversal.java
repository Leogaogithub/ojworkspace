package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L94BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(final TreeNode root) {
        final Deque<OperationPair> deque = new ArrayDeque<>();
        final List<Integer> res = new ArrayList<>();
        deque.addFirst(new OperationPair(1, root));
        while (!deque.isEmpty()) {
            final OperationPair op = deque.pollFirst();
            if (op.operation == 2 && op.node!=null) {
                res.add(op.node.val);
            }else {
                deque.addFirst(new OperationPair(1, op.node.right));
                deque.addFirst(new OperationPair(2, root));
                deque.addFirst(new OperationPair(1, op.node.left));
            }
        }

        return res;
    }

    private class OperationPair {

        public TreeNode node;
        public int operation;// 1 visit 2 print

        public OperationPair(final int operation, final TreeNode node) {
            this.operation = operation;
            this.node = node;
        }
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
