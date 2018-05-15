package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class L239SlidingWindowMaximum {

    public int[] maxSlidingWindow(final int[] nums, final int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }
        final int[] result = new int[nums.length - k + 1];
        final Deque<Integer> deque = new ArrayDeque<>();
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            //remove small ones
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            //remove out of date data
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            //put new
            deque.offer(i);
            //get cur max
            if (i - k + 1 >= 0) {
                result[r++] = nums[deque.peek()];
            }
        }
        return result;
    }
}
