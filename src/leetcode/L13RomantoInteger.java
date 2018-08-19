package leetcode;

import java.util.HashMap;
import java.util.Map;

public class L13RomantoInteger {

    Map<String, Integer> map = new HashMap<String, Integer>() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
        }
    };

    public int romanToInt(final String s) {
        int i = 0;
        int result = 0;
        while (i < s.length()) {
            final String cur;
            try {
                cur = s.substring(i, i + 2);
                if (map.containsKey(cur)) {
                    result += map.get(cur);
                    i += 2;
                } else {
                    result += map.get(s.substring(i, i + 1));
                    i++;
                }
            } catch (final IndexOutOfBoundsException e) {
                result += map.get(s.substring(i, i + 1));
                return result;
            }
        }
        return result;
    }
}
