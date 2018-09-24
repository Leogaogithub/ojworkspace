package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L387FirstUniqueCharacterinaString {

    public int firstUniqChar(final String s) {
        final char[] cs = s.toCharArray();
        final Map<Character, Integer> map = new HashMap<>();
        final Set<Character> set = new HashSet<>();

        for (int i = 0; i < cs.length; i++) {
            if (map.containsKey(cs[i])) {
                set.remove(cs[i]);
            } else {
                map.put(cs[i], i);
                set.add(cs[i]);
            }
        }
        if (set.size() == 0) return -1;

        int result = cs.length;
        for (final char c : set) {
            result = Math.min(result, map.get(c));
        }
        return result;
    }
}
