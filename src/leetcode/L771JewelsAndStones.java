package leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class L771JewelsAndStones {

    public int numJewelsInStones(final String J, final String S) {
        final Set set = new HashSet();
        for (final char j : J.toCharArray()) {
            set.add(j);
        }

        int res = 0;
        for (final char s : S.toCharArray()) {
            if (set.contains(s)) {
                res++;
            }
        }
        return res;
    }

    //solution1
    public int numJewelsInStones1(final String J, final String S) {
        final Set<Character> set = J.chars()
                .mapToObj(m -> (char) m)
                .collect(Collectors.toSet());
        return (int) S.chars()
                .mapToObj(m -> (char) m)
                .filter(m -> set.contains(m))
                .count();
    }
}
