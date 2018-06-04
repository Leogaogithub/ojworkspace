package leetcode;

public class L5LongestPalindromicSubstring {

    int start = 0;
    int length = 0;

    public String longestPalindrome(final String s) {
        if (s.isEmpty()) return s;
        final char[] ss = s.toCharArray();
        start = 0;
        length = 0;
        for (int i = 0; i < ss.length; i++) {
            extendPalindrome(ss, i, i);
            extendPalindrome(ss, i, i + 1);
        }

        return s.substring(start, start + length);
    }

    private void extendPalindrome(final char[] ss, int left, int right) {
        while (left >= 0 && right < ss.length && ss[left] == ss[right]) {
            left--;
            right++;
        }
        final int curlen = right - left - 1;
        if (length < curlen) {
            length = curlen;
            start = left + 1;
        }
    }
}
