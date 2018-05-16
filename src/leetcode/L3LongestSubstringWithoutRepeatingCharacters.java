package leetcode;

import java.util.HashMap;
import java.util.Map;

public class L3LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(final String s) {
        final Map<Character, Integer> map = new HashMap<>();
        final int n = s.length();
        int i = 0, j = 0, max = 0;
        while (i < n && j < n) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            max = Math.max(max, j - i + 1);
            map.put(s.charAt(j), j);
            j++;
        }
        return max;
    }
}
