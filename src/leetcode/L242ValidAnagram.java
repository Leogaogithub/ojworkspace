package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leo on 8/25/18.
 */
public class L242ValidAnagram {

    public boolean isAnagram(final String s, final String t) {
        if (s.length() != t.length()) return false;

        final Map<Character, Integer> map = new HashMap<>();
        for (final Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (final Character c : t.toCharArray()) {
            try {
                final int count = map.get(c);
                if (count == 0) return false;
                map.put(c, count - 1);
            } catch (final Exception e) {
                return false;
            }
        }
        return true;
    }
}
