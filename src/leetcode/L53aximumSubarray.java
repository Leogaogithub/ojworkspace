package leetcode;

public class L53aximumSubarray {

    public int maxSubArray(final int[] nums) {
        final int[] sum = new int[nums.length];
        sum[0] = nums[0];
        int result = sum[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = Math.max(nums[i], sum[i - 1] + nums[i]);
            result = Math.max(sum[i], result);
        }
        return result;
    }
}
