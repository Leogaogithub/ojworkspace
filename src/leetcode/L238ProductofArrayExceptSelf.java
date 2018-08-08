package leetcode;

public class L238ProductofArrayExceptSelf {

    public int[] productExceptSelf(final int[] nums) {
        if (nums.length <= 0) return nums;
        final int[] output = new int[nums.length];
        output[0] = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            output[i] = output[i - 1] * nums[i];
        }
        output[nums.length - 1] = output[nums.length - 2];
        int rightProduct = nums[nums.length - 1];
        for (int i = nums.length - 2; i > 0; i--) {
            output[i] = rightProduct * output[i - 1];
            rightProduct *= nums[i];
        }
        output[0] = rightProduct;

        return output;
    }
}
