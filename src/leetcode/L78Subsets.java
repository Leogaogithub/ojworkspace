package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L78Subsets {

    List<List<Integer>> result;

    public List<List<Integer>> subsets(final int[] nums) {
        result = new ArrayList<>();
        helper(0, new ArrayList<>(), nums);
        return result;
    }

    void helper(final int startIndex, final List<Integer> curList, final int[] nums) {
        result.add(new ArrayList<>(curList));
        if (startIndex == nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            curList.add(nums[i]);
            helper(i + 1, curList, nums);
            curList.remove(curList.size() - 1);
        }
    }
}
