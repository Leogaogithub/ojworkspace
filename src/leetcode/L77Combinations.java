package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L77Combinations {

    List<List<Integer>> result;

    public List<List<Integer>> combine(final int n, final int k) {
        result = new ArrayList<>();
        final List<Integer> curList = new ArrayList<>();
        //solution1
        //helper(k, 1, n, curList);
        helper2(1, n, k, curList);
        return result;
    }

    // solution1
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

    // solution2 better then solution1
    // solution2 have less function call stack
    void helper2(final int start, final int n, final int k, final List<Integer> curList) {
        if (k == 0) {
            result.add(new ArrayList<>(curList));
            return;
        }

        for (int i = start; i <= n; i++) {
            curList.add(i);
            helper2(i + 1, n, k - 1, curList);
            curList.remove(curList.size() - 1);
        }
    }
}
