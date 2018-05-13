package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L90SubsetsII {

    List<List<Integer>> result;

    public List<List<Integer>> subsetsWithDup(final int[] nums) {
        result = new ArrayList<>();
        Arrays.sort(nums);
        final boolean[] used = new boolean[nums.length];
        helper(0, used, new ArrayList<>(), nums);
        return result;
    }

    void helper(final int startIndex, final boolean[] used, final List<Integer> curList, final int[] nums) {
        result.add(new ArrayList<>(curList));
        if (startIndex == nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false) {
                continue;
            }
            curList.add(nums[i]);
            used[i] = true;
            helper(i + 1, used, curList, nums);
            used[i] = false;
            curList.remove(curList.size() - 1);
        }
    }
}
