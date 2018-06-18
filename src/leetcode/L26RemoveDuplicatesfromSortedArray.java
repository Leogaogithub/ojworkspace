package leetcode;

public class L26RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(final int[] nums) {
        if (nums.length <= 1) return nums.length;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) continue;
            nums[count++] = nums[i + 1];
        }
        return count;
    }
}
