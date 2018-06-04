package leetcode;

public class L14LongestCommonPrefix {

    public String longestCommonPrefix(final String[] strs) {
        if (strs.length == 0) return "";
        String res = strs[0];
        for (final String str : strs) {
            final int common = commonPrefix(res, str);
            if (common == 0) return "";
            res = res.substring(0, common);
        }
        return res;
    }

    int commonPrefix(final String str1, final String str2) {
        if (str1.length() > str2.length()) {
            return commonPrefix(str2, str1);
        }
        int i = 0;
        while (i < str1.length() && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return i;
    }
}
