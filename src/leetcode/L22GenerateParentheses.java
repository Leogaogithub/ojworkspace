package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L22GenerateParentheses {

    public List<String> generateParenthesis(final int n) {
        final List<String> res = new ArrayList<>();
        backtrack(res, 0, 0, new StringBuilder(), n);
        return res;
    }

    private void backtrack(final List<String> res, final int open, final int close, final StringBuilder cur, final int n) {
        if (open < close || open > n) return;
        if (open + close == 2 * n) {
            if (open == close) {
                res.add(cur.toString());
            }
            return;
        }
        final int curlen = open + close;
        backtrack(res, open + 1, close, cur.append("("), n);
        cur.setLength(curlen);
        backtrack(res, open, close + 1, cur.append(")"), n);
        cur.setLength(curlen);
    }
}
