package leetcode;

import java.util.Queue;

public class TreeGenerator<T> {

    TreeNode<T> createTreeFromArrayBFS(T[] input) {
        if (input[0] == null) return null;
        TreeNode<T> root = new TreeNode<>(input[0]);
        Queue<TreeNode<T>> queue = new java.util.LinkedList<>();
        int index = 0;
        queue.add(root);
        while (!queue.isEmpty()) {

        }

        return null;
    }
}
