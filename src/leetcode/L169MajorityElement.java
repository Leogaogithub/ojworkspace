package leetcode;

import java.util.Arrays;

public class L169MajorityElement {

    public int majorityElement(final int[] nums) {
        final int mid = nums.length / 2;
        Arrays.sort(nums);
        return nums[mid];
    }
}
