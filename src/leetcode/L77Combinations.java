package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L77Combinations {

    List<List<Integer>> result;

    public List<List<Integer>> combine(final int n, final int k) {
        result = new ArrayList<>();
        final List<Integer> curList = new ArrayList<>();
        helper(k, 1, n, curList);
        return result;
    }

    void helper(final int k, final int curValue, final int n, final List<Integer> curList) {
        if (k == curList.size()) {
            result.add(new ArrayList<>(curList));
            return;
        }
        if (n == curValue - 1) {
            return;
        }

        // select curValue
        curList.add(curValue);
        helper(k, curValue + 1, n, curList);
        curList.remove(curList.size() - 1);

        // not select
        helper(k, curValue + 1, n, curList);
    }
}
