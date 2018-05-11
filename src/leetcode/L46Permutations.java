package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L46Permutations {

    List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> permute(final int[] nums) {
        results = new ArrayList<>();
        final List<Integer> curList = new ArrayList<>();
        permuteHelper(nums, curList);
        return results;
    }

    void permuteHelper(final int[] nums, final List<Integer> curList) {
        if (curList.size() == nums.length) {
            results.add(new ArrayList<>(curList));
            return;
        }

        for (final int num : nums) {
            if (curList.contains(num)) {
                continue;
            }
            curList.add(num);
            permuteHelper(nums, curList);
            curList.remove(curList.size() - 1);
        }
    }
}
