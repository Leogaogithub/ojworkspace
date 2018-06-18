package leetcode;

public class L28ImplementstrStr {

    public int strStr(final String haystack, final String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.length() < needle.length()) return -1;
        final char[] h = haystack.toCharArray();
        final char[] n = needle.toCharArray();
        final int endi = h.length - n.length;
        for (int i = 0; i <= endi; i++) {
            int j = 0;
            for (; j < n.length; j++) {
                if (n[j] != h[i + j]) break;
            }
            if (j == n.length) return i;
        }
        return -1;
    }
}
