package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L47PermutationsII {

    List<List<Integer>> results;
    boolean[] used;

    public List<List<Integer>> permuteUnique(final int[] nums) {
        results = new ArrayList<>();
        used = new boolean[nums.length];
        final List<Integer> curList = new ArrayList<>();
        Arrays.sort(nums);
        permuteHelper(nums, curList);
        return results;
    }

    void permuteHelper(final int[] nums, final List<Integer> curList) {
        if (curList.size() == nums.length) {
            results.add(new ArrayList<>(curList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] == true) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] != true) {
                continue;
            }
            used[i] = true;
            curList.add(nums[i]);
            permuteHelper(nums, curList);
            curList.remove(curList.size() - 1);
            used[i] = false;
        }
    }
}
