package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class L239SlidingWindowMaximumTest {

    @Test
    public void maxSlidingWindow() throws Exception {
        // Input: nums = [1,3,-1,-3,5,3,6,7], and k = 3
        // Output: [3,3,5,5,6,7]
        final int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        final int k = 3;

        final L239SlidingWindowMaximum solution = new L239SlidingWindowMaximum();
        final int[] result = solution.maxSlidingWindow(nums, k);
        final List<Integer> result1 = Arrays.stream(result).boxed().collect(Collectors.toList());
        assertThat(result1, contains(3, 3, 5, 5, 6, 7));
    }
}