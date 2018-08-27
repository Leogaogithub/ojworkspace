package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leo on 8/25/18.
 */
public class L217ContainsDuplicate {

    public boolean containsDuplicate(final int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (final int n : nums) {
            if (map.containsKey(n)) {
                return true;
            }
            map.put(n, 1);
        }
        return false;
    }
}
