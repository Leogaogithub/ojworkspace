package leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class L20ValidParentheses {

    static Map<Character, Character> map = new HashMap();

    public L20ValidParentheses() {
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
    }

    public boolean isValid(final String s) {
        if (s == null || s.length() == 0) return true;

        final char[] ss = s.toCharArray();
        final Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < ss.length; i++) {
            if (map.containsKey(ss[i])) {
                if (stack.isEmpty()) return false;
                final char elem = stack.pollFirst();
                if (elem != map.get(ss[i])) return false;
            } else {
                stack.addFirst(ss[i]);
            }
        }

        return stack.isEmpty();
    }
}
